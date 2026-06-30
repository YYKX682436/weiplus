package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146631d = 0;

    public p0(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.q0 q0Var, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146631d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146631d;
        this.f146631d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
