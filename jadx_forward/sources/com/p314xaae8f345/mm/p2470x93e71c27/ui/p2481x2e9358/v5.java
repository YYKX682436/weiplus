package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes6.dex */
public class v5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272226d = 0;

    public v5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w5 w5Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u5 u5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272226d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272226d;
        this.f272226d = i17 + 1;
        if (i17 == 0) {
            return g30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
