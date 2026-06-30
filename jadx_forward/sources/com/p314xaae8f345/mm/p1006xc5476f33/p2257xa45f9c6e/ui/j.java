package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f254161d = 0;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f254161d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f254161d;
        this.f254161d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
