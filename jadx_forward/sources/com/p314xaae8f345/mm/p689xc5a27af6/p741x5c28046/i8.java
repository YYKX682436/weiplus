package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class i8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147867d = 0;

    public i8(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j8 j8Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h8 h8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147867d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147867d;
        this.f147867d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
