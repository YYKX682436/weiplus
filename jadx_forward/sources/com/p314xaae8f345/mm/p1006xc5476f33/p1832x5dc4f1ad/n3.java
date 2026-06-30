package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class n3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229616d = 0;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o3 o3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m3 m3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229616d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229616d;
        this.f229616d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
