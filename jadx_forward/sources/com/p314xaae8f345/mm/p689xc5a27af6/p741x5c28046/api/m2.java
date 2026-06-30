package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class m2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147644d = 0;

    public m2(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n2 n2Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.l2 l2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147644d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147644d;
        this.f147644d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
