package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class b7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275307d = 0;

    public b7(com.p314xaae8f345.mm.p2621x8fb0427b.c7 c7Var, com.p314xaae8f345.mm.p2621x8fb0427b.a7 a7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275307d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275307d;
        this.f275307d = i17 + 1;
        if (i17 == 0) {
            return k41.x0.INSTANCE;
        }
        if (i17 == 1) {
            return f01.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
