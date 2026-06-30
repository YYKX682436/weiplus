package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class y4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147701d = 0;

    public y4(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z4 z4Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x4 x4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147701d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147701d;
        this.f147701d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.hb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
