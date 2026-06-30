package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f234117d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f234117d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f234117d;
        this.f234117d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
