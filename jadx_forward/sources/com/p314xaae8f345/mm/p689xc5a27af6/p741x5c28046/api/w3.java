package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class w3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147690d = 0;

    public w3(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x3 x3Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v3 v3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147690d;
        this.f147690d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
