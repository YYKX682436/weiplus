package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class a4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156542d = 0;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.b4 b4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.z3 z3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156542d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156542d;
        this.f156542d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
