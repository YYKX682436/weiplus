package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class o1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147651d = 0;

    public o1(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p1 p1Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n1 n1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147651d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147651d;
        this.f147651d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.i5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
