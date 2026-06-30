package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class k9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147899d = 0;

    public k9(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l9 l9Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j9 j9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147899d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147899d;
        this.f147899d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.i4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
