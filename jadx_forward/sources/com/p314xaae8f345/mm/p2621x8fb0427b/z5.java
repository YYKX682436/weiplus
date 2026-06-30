package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class z5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f277934d = 0;

    public z5(com.p314xaae8f345.mm.p2621x8fb0427b.a6 a6Var, com.p314xaae8f345.mm.p2621x8fb0427b.y5 y5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f277934d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f277934d;
        this.f277934d = i17 + 1;
        if (i17 == 0) {
            return xw.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
