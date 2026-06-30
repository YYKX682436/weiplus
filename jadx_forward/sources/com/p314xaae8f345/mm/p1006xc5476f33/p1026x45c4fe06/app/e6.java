package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class e6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156601d = 0;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.f6 f6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d6 d6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156601d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156601d;
        this.f156601d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
