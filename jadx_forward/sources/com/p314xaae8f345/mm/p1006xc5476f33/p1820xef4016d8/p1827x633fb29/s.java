package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f227127d = 0;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f227127d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f227127d;
        this.f227127d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
