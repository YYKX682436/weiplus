package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class w9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148064d = 0;

    public w9(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.x9 x9Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v9 v9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148064d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148064d;
        this.f148064d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
