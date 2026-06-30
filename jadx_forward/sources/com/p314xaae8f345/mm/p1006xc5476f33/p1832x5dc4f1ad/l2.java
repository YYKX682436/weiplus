package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class l2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229599d = 0;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m2 m2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k2 k2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229599d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229599d;
        this.f229599d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.j6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
