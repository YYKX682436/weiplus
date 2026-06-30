package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes6.dex */
public class t1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270615d = 0;

    public t1(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u1 u1Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s1 s1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270615d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270615d;
        this.f270615d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
