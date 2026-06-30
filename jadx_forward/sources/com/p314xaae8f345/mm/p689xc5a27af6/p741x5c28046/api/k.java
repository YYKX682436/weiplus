package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147630d = 0;

    public k(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.l lVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147630d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147630d;
        this.f147630d = i17 + 1;
        if (i17 == 0) {
            return g30.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
