package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class o3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156743d = 0;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.p3 p3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n3 n3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156743d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156743d;
        this.f156743d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
