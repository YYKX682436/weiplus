package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class g5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147820d = 0;

    public g5(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h5 h5Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f5 f5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147820d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147820d;
        this.f147820d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
