package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class ia implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147870d = 0;

    public ia(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ja jaVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ha haVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147870d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147870d;
        this.f147870d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.db.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
