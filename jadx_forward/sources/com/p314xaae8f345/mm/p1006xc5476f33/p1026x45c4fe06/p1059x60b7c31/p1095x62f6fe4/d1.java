package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f163290d = 0;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f163290d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f163290d;
        this.f163290d = i17 + 1;
        if (i17 == 0) {
            return oe1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
