package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f151931d = 0;

    public j(com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.k kVar, com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f151931d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f151931d;
        this.f151931d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
