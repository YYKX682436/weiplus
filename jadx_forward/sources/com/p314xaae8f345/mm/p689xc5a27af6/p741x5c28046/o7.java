package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class o7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147954d = 0;

    public o7(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p7 p7Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n7 n7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147954d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147954d;
        this.f147954d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
