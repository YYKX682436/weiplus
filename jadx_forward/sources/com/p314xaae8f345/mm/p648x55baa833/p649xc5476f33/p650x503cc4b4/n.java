package com.p314xaae8f345.mm.p648x55baa833.p649xc5476f33.p650x503cc4b4;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145201d = 0;

    public n(com.p314xaae8f345.mm.p648x55baa833.p649xc5476f33.p650x503cc4b4.o oVar, com.p314xaae8f345.mm.p648x55baa833.p649xc5476f33.p650x503cc4b4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145201d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145201d;
        this.f145201d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p648x55baa833.p649xc5476f33.p650x503cc4b4.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
