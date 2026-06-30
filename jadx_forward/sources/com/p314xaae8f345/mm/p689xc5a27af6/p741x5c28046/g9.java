package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class g9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147826d = 0;

    public g9(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h9 h9Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f9 f9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147826d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147826d;
        this.f147826d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
