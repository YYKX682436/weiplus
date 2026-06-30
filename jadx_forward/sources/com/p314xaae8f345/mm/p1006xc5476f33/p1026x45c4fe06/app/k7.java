package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class k7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156689d = 0;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l7 l7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.j7 j7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156689d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156689d;
        this.f156689d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.ra.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
