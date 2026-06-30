package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class q2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147662d = 0;

    public q2(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r2 r2Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p2 p2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147662d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147662d;
        this.f147662d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
