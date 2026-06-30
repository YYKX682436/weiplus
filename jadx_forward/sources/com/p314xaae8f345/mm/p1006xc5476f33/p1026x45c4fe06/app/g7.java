package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes6.dex */
public class g7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f156641d = 0;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.h7 h7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.f7 f7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f156641d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f156641d;
        this.f156641d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.pa.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
