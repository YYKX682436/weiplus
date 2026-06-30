package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes6.dex */
public class n1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170254d = 0;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m1 m1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170254d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170254d;
        this.f170254d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
