package com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270097d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270097d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270097d;
        this.f270097d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
