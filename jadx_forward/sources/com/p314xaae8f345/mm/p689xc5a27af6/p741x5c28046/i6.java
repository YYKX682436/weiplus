package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class i6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147864d = 0;

    public i6(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j6 j6Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h6 h6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147864d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147864d;
        this.f147864d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
