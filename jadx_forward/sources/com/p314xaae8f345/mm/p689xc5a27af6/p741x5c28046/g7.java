package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class g7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147823d = 0;

    public g7(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h7 h7Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f7 f7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147823d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147823d;
        this.f147823d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
