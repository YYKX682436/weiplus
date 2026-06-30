package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class g3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147615d = 0;

    public g3(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.h3 h3Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f3 f3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147615d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147615d;
        this.f147615d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
