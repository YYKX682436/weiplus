package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274049d = 0;

    public d1(com.p314xaae8f345.mm.sdk.p2603x2137b148.e1 e1Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274049d;
        this.f274049d = i17 + 1;
        if (i17 == 0) {
            return ll3.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
