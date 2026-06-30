package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class u6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148035d = 0;

    public u6(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v6 v6Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t6 t6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148035d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148035d;
        this.f148035d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
