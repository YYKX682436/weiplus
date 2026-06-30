package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172244d = 0;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172244d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172244d;
        this.f172244d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
