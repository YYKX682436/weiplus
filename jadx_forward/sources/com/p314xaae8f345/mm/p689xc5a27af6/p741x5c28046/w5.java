package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class w5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148058d = 0;

    public w5(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.x5 x5Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v5 v5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148058d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148058d;
        this.f148058d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
