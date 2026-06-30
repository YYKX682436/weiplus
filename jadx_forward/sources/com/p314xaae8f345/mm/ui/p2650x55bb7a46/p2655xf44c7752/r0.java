package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282850d = 0;

    public r0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s0 s0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282850d < 4;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282850d;
        this.f282850d = i17 + 1;
        if (i17 == 0) {
            return mc5.u.INSTANCE;
        }
        if (i17 == 1) {
            return mc5.r.INSTANCE;
        }
        if (i17 == 2) {
            return mc5.y.INSTANCE;
        }
        if (i17 == 3) {
            return mc5.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 4");
    }
}
