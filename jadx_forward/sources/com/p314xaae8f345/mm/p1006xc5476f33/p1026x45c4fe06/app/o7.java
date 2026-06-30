package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class o7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156749d = 0;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.p7 p7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n7 n7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156749d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156749d;
        this.f156749d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.cb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
