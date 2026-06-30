package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229731d = 0;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229731d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229731d;
        this.f229731d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.t7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
