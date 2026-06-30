package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f182815d = 0;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f182815d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f182815d;
        this.f182815d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.gc.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
