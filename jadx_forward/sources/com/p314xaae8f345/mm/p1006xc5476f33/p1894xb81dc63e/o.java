package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f232007d = 0;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f232007d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f232007d;
        this.f232007d = i17 + 1;
        if (i17 == 0) {
            return gh4.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
