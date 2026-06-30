package com.p314xaae8f345.mm.p1006xc5476f33.biz;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f175394d = 0;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.biz.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.biz.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f175394d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f175394d;
        this.f175394d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.biz.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
