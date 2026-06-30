package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class u2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147680d = 0;

    public u2(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v2 v2Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t2 t2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147680d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147680d;
        this.f147680d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
