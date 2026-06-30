package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147666d = 0;

    public s(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t tVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147666d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147666d;
        this.f147666d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
