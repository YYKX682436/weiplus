package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes6.dex */
public class l5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158047d = 0;

    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.m5 m5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k5 k5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158047d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158047d;
        this.f158047d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
