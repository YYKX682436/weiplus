package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146695d = 0;

    public h0(com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.i0 i0Var, com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146695d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146695d;
        this.f146695d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
