package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class e2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f254510d = 0;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.f2 f2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.d2 d2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f254510d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f254510d;
        this.f254510d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
