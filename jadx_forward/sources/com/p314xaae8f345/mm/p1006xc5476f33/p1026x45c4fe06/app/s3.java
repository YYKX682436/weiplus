package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class s3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156805d = 0;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t3 t3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r3 r3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156805d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156805d;
        this.f156805d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
