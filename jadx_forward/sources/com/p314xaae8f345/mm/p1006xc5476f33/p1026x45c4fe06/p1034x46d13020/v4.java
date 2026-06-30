package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes6.dex */
public class v4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158132d = 0;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w4 w4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.u4 u4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158132d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158132d;
        this.f158132d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
