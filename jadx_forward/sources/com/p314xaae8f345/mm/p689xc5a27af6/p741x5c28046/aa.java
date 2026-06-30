package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class aa implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147573d = 0;

    public aa(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ba baVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.z9 z9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147573d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147573d;
        this.f147573d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ya.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
