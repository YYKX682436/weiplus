package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes6.dex */
public class x2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170346d = 0;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.w2 w2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170346d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170346d;
        this.f170346d = i17 + 1;
        if (i17 == 0) {
            return lm1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
