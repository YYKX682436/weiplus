package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class m6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147925d = 0;

    public m6(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n6 n6Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l6 l6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147925d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147925d;
        this.f147925d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
