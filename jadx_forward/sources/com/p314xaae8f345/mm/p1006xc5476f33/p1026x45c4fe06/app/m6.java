package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class m6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156716d = 0;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n6 n6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l6 l6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156716d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156716d;
        this.f156716d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.z9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
