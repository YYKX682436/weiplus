package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f253648d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f253648d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f253648d;
        this.f253648d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
