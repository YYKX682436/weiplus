package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes6.dex */
public class c1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f183581d = 0;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b1 b1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f183581d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f183581d;
        this.f183581d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
