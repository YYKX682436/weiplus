package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class t0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65115d = 0;

    public t0(com.tencent.mm.feature.appbrand.support.u0 u0Var, com.tencent.mm.feature.appbrand.support.s0 s0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65115d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65115d;
        this.f65115d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
