package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class q8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147981d = 0;

    public q8(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r8 r8Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p8 p8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147981d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147981d;
        this.f147981d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
