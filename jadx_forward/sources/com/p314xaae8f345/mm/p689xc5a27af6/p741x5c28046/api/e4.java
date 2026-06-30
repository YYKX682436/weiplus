package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class e4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147606d = 0;

    public e4(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f4 f4Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d4 d4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147606d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147606d;
        this.f147606d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
