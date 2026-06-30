package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class c5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147597d = 0;

    public c5(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d5 d5Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.b5 b5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147597d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147597d;
        this.f147597d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.jb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
