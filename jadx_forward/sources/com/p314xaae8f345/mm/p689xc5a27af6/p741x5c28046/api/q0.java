package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class q0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147659d = 0;

    public q0(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r0 r0Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p0 p0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147659d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147659d;
        this.f147659d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
