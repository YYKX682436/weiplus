package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class q4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147665d = 0;

    public q4(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r4 r4Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p4 p4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147665d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147665d;
        this.f147665d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.fb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
