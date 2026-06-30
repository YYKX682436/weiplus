package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class w1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147687d = 0;

    public w1(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x1 x1Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v1 v1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147687d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147687d;
        this.f147687d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
