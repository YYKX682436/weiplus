package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f182896d = 0;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f182896d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f182896d;
        this.f182896d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.rc.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
