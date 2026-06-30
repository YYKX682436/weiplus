package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes.dex */
public class c5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147741d = 0;

    public c5(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d5 d5Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b5 b5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147741d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147741d;
        this.f147741d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
