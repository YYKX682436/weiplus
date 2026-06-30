package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f151928d = 0;

    public f(com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.g gVar, com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f151928d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f151928d;
        this.f151928d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
