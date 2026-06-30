package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes6.dex */
public class z0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274659d = 0;

    public z0(com.p314xaae8f345.mm.sdk.p2603x2137b148.a1 a1Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.y0 y0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274659d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274659d;
        this.f274659d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.m5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
