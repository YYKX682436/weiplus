package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147609d = 0;

    public g(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.h hVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147609d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147609d;
        this.f147609d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
