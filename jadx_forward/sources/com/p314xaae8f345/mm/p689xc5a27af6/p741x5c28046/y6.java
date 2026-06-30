package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class y6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148095d = 0;

    public y6(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.z6 z6Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.x6 x6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148095d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148095d;
        this.f148095d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
