package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class k5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147893d = 0;

    public k5(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l5 l5Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j5 j5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147893d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147893d;
        this.f147893d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
