package com.xyang;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiuyuanyang on 9/20/2016.
 */
public class FastSort {

//    private List<Integer> sortedContainer = new ArrayList<Integer>();


    private static void doOnceSort( List<Integer> so, int indexStart, int indexEnd ) {

        int switchTmp;
        int indexCurrent = indexStart ;
        for (int i = indexStart+1; i < indexEnd; i++){

            if(so.get(indexCurrent) > so.get(i)){
                switchTmp = so.get(i);
                so.remove(i);
                so.add(indexStart,switchTmp);
                indexCurrent ++;
            }
        }

        System.out.println(so);
//        sortedContainer.add(indexCurrent,so.get(indexCurrent));

        if(indexCurrent > indexStart) {
            int leftStart = indexStart;
            int leftEnd = indexCurrent;
            doOnceSort(so, leftStart , leftEnd);
        }

        if(indexEnd > indexCurrent +1 ) {
            int righStart = indexCurrent +1 ;
            int righEnd= indexEnd ;
            doOnceSort(so, righStart , righEnd);
        }
    }




    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);


        list.add(19);
        list.add(17);
        list.add(18);
        list.add(14);
        list.add(16);
        list.add(15);
        list.add(11);
        list.add(13);
        list.add(12);


        list.add(19);
        list.add(17);
        list.add(18);
        list.add(14);
        list.add(16);
        list.add(15);
        list.add(11);
        list.add(13);
        list.add(12);

        System.out.println("~~~~~~~~~~~~before sort");
        System.out.println(list);
        System.out.println("~~~~~~~~~~~~before sort");


        FastSort.doOnceSort(list,0,list.size());

        System.out.println("~~~~~~~~~~~~after sort");
        System.out.println(list);

    }

}
