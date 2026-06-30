package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes6.dex */
public class x1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270670d = 0;

    public x1(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y1 y1Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w1 w1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270670d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270670d;
        this.f270670d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
