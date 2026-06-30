package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class x4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f289763d = 0;

    public x4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y4 y4Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w4 w4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f289763d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f289763d;
        this.f289763d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
