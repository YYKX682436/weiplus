package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes6.dex */
public class h2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170211d = 0;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i2 i2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g2 g2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170211d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170211d;
        this.f170211d = i17 + 1;
        if (i17 == 0) {
            return gi1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
