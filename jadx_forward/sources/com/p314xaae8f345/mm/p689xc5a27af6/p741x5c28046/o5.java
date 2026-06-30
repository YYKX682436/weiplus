package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class o5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147951d = 0;

    public o5(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p5 p5Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n5 n5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147951d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147951d;
        this.f147951d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
