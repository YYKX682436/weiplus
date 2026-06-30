package com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f292582d = 0;

    public b(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.c cVar, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f292582d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f292582d;
        this.f292582d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
