package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes6.dex */
public class a2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156945d = 0;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b2 b2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z1 z1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156945d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156945d;
        this.f156945d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
