package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f171136d = 0;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f171136d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f171136d;
        this.f171136d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
