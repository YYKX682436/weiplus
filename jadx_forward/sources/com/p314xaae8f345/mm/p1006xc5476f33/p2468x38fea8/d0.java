package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270166d = 0;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270166d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270166d;
        this.f270166d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
