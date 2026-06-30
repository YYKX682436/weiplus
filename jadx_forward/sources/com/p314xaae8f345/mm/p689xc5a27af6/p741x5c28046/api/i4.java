package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class i4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147627d = 0;

    public i4(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j4 j4Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.h4 h4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147627d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147627d;
        this.f147627d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ya.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
