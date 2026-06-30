package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes6.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146661d = 0;

    public x0(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.y0 y0Var, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146661d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146661d;
        this.f146661d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
