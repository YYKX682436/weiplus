package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes6.dex */
public class d2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148945d = 0;

    public d2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.e2 e2Var, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.c2 c2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148945d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148945d;
        this.f148945d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
