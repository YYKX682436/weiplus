package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f177685d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f177685d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f177685d;
        this.f177685d = i17 + 1;
        if (i17 == 0) {
            return ww1.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
