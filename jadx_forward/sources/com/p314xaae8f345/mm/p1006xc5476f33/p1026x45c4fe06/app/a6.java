package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class a6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156545d = 0;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.b6 b6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.z5 z5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156545d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156545d;
        this.f156545d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n9.INSTANCE;
        }
        if (i17 == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.k9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
