package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class c7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147744d = 0;

    public c7(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d7 d7Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b7 b7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147744d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147744d;
        this.f147744d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
