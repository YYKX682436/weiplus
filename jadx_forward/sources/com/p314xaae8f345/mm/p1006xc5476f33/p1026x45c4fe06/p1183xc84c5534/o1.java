package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes6.dex */
public class o1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f169661d = 0;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n1 n1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f169661d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f169661d;
        this.f169661d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
