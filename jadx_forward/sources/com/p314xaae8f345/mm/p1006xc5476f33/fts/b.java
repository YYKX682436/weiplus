package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f218905d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.fts.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218905d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f218905d;
        this.f218905d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.fts.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
