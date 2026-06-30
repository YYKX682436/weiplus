package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270562d = 0;

    public p1(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.q1 q1Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270562d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270562d;
        this.f270562d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
