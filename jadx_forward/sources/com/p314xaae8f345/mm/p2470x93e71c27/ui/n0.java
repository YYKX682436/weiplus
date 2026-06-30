package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes6.dex */
public class n0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272426d = 0;

    public n0(com.p314xaae8f345.mm.p2470x93e71c27.ui.o0 o0Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.m0 m0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272426d < 6;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272426d;
        this.f272426d = i17 + 1;
        if (i17 == 0) {
            return cr1.j.INSTANCE;
        }
        if (i17 == 1) {
            return z33.k.INSTANCE;
        }
        if (i17 == 2) {
            return ji4.v.INSTANCE;
        }
        if (i17 == 3) {
            return b63.n.INSTANCE;
        }
        if (i17 == 4) {
            return ir4.n.INSTANCE;
        }
        if (i17 == 5) {
            return mn2.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 6");
    }
}
