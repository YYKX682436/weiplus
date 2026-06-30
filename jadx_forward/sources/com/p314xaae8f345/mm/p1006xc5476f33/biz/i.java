package com.p314xaae8f345.mm.p1006xc5476f33.biz;

/* loaded from: classes.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f175397d = 0;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.biz.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.biz.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f175397d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f175397d;
        this.f175397d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.biz.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
