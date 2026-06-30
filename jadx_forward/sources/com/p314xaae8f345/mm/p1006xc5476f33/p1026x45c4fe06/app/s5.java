package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class s5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156808d = 0;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t5 t5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r5 r5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156808d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156808d;
        this.f156808d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.k8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
