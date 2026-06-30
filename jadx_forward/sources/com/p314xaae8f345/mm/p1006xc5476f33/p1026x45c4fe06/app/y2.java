package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class y2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156875d = 0;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.x2 x2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156875d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156875d;
        this.f156875d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
