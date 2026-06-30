package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes6.dex */
public class z5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272304d = 0;

    public z5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.a6 a6Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y5 y5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272304d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272304d;
        this.f272304d = i17 + 1;
        if (i17 == 0) {
            return g30.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
