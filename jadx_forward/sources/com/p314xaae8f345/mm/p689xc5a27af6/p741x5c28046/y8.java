package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class y8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148098d = 0;

    public y8(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.z8 z8Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.x8 x8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148098d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148098d;
        this.f148098d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
