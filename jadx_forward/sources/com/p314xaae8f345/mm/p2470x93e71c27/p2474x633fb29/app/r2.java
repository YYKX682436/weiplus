package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes6.dex */
public class r2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270587d = 0;

    public r2(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s2 s2Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.q2 q2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270587d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270587d;
        this.f270587d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
