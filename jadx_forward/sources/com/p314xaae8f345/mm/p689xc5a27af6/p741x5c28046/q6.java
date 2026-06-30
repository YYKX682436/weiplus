package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class q6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147978d = 0;

    public q6(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r6 r6Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p6 p6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147978d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147978d;
        this.f147978d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
