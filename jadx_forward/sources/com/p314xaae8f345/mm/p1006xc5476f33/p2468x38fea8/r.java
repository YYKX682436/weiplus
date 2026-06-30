package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270209d = 0;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270209d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270209d;
        this.f270209d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p642xad8b531f.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
