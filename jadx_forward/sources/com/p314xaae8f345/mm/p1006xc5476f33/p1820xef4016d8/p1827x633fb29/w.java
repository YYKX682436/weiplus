package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f227203d = 0;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f227203d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f227203d;
        this.f227203d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.b3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
