package com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f178223d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f178223d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f178223d;
        this.f178223d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
