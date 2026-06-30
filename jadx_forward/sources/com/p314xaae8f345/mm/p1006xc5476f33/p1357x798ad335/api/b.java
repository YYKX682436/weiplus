package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f178434d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f178434d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f178434d;
        this.f178434d = i17 + 1;
        if (i17 == 0) {
            return a02.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
