package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes6.dex */
public class j2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270478d = 0;

    public j2(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k2 k2Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i2 i2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270478d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270478d;
        this.f270478d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
