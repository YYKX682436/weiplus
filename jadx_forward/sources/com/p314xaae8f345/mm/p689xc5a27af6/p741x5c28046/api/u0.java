package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147677d = 0;

    public u0(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v0 v0Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147677d;
        this.f147677d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
