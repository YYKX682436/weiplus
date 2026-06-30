package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class a2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f254460d = 0;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.b2 b2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.z1 z1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f254460d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f254460d;
        this.f254460d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.r1.INSTANCE;
        }
        if (i17 == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
