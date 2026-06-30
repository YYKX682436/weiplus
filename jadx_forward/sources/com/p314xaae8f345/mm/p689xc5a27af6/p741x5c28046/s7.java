package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class s7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148008d = 0;

    public s7(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t7 t7Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r7 r7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148008d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148008d;
        this.f148008d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
