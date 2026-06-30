package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class c9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147747d = 0;

    public c9(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d9 d9Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b9 b9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147747d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147747d;
        this.f147747d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
