package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class j3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229569d = 0;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k3 k3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i3 i3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229569d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229569d;
        this.f229569d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
