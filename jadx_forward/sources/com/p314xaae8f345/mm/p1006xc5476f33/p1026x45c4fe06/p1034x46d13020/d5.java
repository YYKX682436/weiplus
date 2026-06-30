package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes6.dex */
public class d5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f157949d = 0;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e5 e5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c5 c5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f157949d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f157949d;
        this.f157949d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
