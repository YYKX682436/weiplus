package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class u4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156830d = 0;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v4 v4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t4 t4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156830d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156830d;
        this.f156830d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
