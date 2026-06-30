package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class y2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147698d = 0;

    public y2(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z2 z2Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x2 x2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147698d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147698d;
        this.f147698d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
