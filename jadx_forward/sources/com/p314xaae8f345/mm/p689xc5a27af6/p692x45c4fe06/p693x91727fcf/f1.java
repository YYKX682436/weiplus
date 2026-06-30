package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146605d = 0;

    public f1(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.g1 g1Var, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146605d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146605d;
        this.f146605d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
