package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f218989d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218989d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f218989d;
        this.f218989d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.t3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
