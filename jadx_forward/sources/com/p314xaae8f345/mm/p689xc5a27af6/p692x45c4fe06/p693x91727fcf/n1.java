package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes6.dex */
public class n1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146628d = 0;

    public n1(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.o1 o1Var, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.m1 m1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146628d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146628d;
        this.f146628d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
