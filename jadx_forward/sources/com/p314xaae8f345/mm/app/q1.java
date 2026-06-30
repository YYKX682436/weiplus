package com.p314xaae8f345.mm.app;

/* loaded from: classes6.dex */
public class q1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f135251d = 0;

    public q1(com.p314xaae8f345.mm.app.r1 r1Var, com.p314xaae8f345.mm.app.p1 p1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f135251d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f135251d;
        this.f135251d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.app.g5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
