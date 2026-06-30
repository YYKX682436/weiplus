package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class qa implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147984d = 0;

    public qa(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ra raVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.pa paVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147984d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147984d;
        this.f147984d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.hb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
