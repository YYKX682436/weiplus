package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270215d = 0;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270215d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270215d;
        this.f270215d = i17 + 1;
        if (i17 == 0) {
            return bt.p1.INSTANCE;
        }
        if (i17 == 1) {
            return bt.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
