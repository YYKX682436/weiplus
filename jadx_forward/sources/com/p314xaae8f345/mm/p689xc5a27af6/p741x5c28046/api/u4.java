package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class u4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147683d = 0;

    public u4(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v4 v4Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t4 t4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147683d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147683d;
        this.f147683d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2614xca6eae71.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
