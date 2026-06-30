package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes6.dex */
public class f3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170201d = 0;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g3 g3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e3 e3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170201d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170201d;
        this.f170201d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
