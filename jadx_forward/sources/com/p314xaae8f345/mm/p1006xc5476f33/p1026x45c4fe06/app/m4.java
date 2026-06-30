package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class m4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156713d = 0;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n4 n4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l4 l4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156713d;
        this.f156713d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
