package com.p314xaae8f345.mm.app;

/* loaded from: classes6.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f134823d = 0;

    public a1(com.p314xaae8f345.mm.app.b1 b1Var, com.p314xaae8f345.mm.app.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f134823d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f134823d;
        this.f134823d = i17 + 1;
        if (i17 == 0) {
            return ov.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
