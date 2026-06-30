package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class e8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147781d = 0;

    public e8(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f8 f8Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d8 d8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147781d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147781d;
        this.f147781d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
