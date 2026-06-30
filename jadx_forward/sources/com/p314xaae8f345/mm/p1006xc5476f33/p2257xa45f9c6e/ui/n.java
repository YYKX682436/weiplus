package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f254182d = 0;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f254182d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f254182d;
        this.f254182d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
