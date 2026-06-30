package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes.dex */
public class a8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147570d = 0;

    public a8(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b8 b8Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.z7 z7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147570d;
        this.f147570d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
