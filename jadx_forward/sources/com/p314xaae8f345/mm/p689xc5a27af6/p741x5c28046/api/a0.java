package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147579d = 0;

    public a0(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.b0 b0Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147579d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147579d;
        this.f147579d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
