package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class s5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148005d = 0;

    public s5(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t5 t5Var, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r5 r5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148005d;
        this.f148005d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
