package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146608d = 0;

    public h0(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.i0 i0Var, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146608d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146608d;
        this.f146608d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
