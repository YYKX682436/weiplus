package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class q6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156768d = 0;

    public q6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r6 r6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.p6 p6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156768d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156768d;
        this.f156768d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.ea.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
