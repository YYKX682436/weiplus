package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class v5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f277817d = 0;

    public v5(com.p314xaae8f345.mm.p2621x8fb0427b.w5 w5Var, com.p314xaae8f345.mm.p2621x8fb0427b.u5 u5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f277817d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f277817d;
        this.f277817d = i17 + 1;
        if (i17 == 0) {
            return xw.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
