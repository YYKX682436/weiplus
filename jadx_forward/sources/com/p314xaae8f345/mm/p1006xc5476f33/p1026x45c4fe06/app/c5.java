package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class c5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156567d = 0;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d5 d5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.b5 b5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156567d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156567d;
        this.f156567d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
