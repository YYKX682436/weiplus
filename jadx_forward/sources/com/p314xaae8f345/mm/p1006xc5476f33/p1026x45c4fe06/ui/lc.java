package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes6.dex */
public class lc implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f171385d = 0;

    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.mc mcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kc kcVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f171385d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f171385d;
        this.f171385d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.qd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
