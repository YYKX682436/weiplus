package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class a4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147585d = 0;

    public a4(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.b4 b4Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z3 z3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147585d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147585d;
        this.f147585d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
