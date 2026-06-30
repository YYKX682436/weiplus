package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class c7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156570d = 0;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d7 d7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.b7 b7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156570d;
        this.f156570d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.na.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
