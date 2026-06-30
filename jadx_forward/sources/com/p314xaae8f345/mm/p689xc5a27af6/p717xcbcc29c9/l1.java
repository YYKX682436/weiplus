package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes6.dex */
public class l1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147033d = 0;

    public l1(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.m1 m1Var, com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.k1 k1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147033d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147033d;
        this.f147033d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
