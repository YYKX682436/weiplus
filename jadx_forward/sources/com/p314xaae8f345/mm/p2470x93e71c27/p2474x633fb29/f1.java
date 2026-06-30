package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270829d = 0;

    public f1(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g1 g1Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270829d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270829d;
        this.f270829d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
