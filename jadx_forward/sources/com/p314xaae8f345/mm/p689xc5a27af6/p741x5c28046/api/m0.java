package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147641d = 0;

    public m0(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n0 n0Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147641d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147641d;
        this.f147641d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
