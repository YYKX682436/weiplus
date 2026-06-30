package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes6.dex */
public class r3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170303d = 0;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q3 q3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170303d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170303d;
        this.f170303d = i17 + 1;
        if (i17 == 0) {
            return ak5.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
