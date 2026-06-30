package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class k7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147896d = 0;

    public k7(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l7 l7Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j7 j7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147896d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147896d;
        this.f147896d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
