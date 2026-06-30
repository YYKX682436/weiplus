package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes6.dex */
public class p4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f289493d = 0;

    public p4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q4 q4Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o4 o4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f289493d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f289493d;
        this.f289493d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
