package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class k1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147633d = 0;

    public k1(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.l1 l1Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j1 j1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147633d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147633d;
        this.f147633d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
