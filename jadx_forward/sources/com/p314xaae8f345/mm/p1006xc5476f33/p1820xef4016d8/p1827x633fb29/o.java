package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f227011d = 0;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f227011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f227011d;
        this.f227011d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
