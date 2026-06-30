package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.FreezableUtils */
/* loaded from: classes4.dex */
public final class C1891x1fce87c9 {
    /* renamed from: freeze */
    public static <T, E extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8<T>> java.util.ArrayList<T> m18044xb4843a97(java.util.ArrayList<E> arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            b0Var.add(arrayList.get(i17).mo18042xb4843a97());
        }
        return b0Var;
    }

    /* renamed from: freezeIterable */
    public static <T, E extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8<T>> java.util.ArrayList<T> m18046x305ddc29(java.lang.Iterable<E> iterable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            b0Var.add(it.next().mo18042xb4843a97());
        }
        return b0Var;
    }

    /* renamed from: freeze */
    public static <T, E extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1890x5f0ff5c8<T>> java.util.ArrayList<T> m18045xb4843a97(E[] eArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(eArr.length);
        for (E e17 : eArr) {
            b0Var.add(e17.mo18042xb4843a97());
        }
        return b0Var;
    }
}
