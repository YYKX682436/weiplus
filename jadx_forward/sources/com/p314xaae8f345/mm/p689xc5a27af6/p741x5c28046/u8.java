package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class u8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148038d = 0;

    public u8(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v8 v8Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t8 t8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148038d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148038d;
        this.f148038d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
