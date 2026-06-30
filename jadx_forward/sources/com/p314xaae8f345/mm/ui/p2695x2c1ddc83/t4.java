package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes6.dex */
public class t4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f289611d = 0;

    public t4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u4 u4Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s4 s4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f289611d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f289611d;
        this.f289611d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
