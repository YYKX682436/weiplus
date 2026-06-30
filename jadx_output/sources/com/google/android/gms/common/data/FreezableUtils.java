package com.google.android.gms.common.data;

/* loaded from: classes4.dex */
public final class FreezableUtils {
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(java.util.ArrayList<E> arrayList) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            b0Var.add(arrayList.get(i17).freeze());
        }
        return b0Var;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeIterable(java.lang.Iterable<E> iterable) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            b0Var.add(it.next().freeze());
        }
        return b0Var;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(E[] eArr) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(eArr.length);
        for (E e17 : eArr) {
            b0Var.add(e17.freeze());
        }
        return b0Var;
    }
}
