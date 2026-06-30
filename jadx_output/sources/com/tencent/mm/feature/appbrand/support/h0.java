package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65075d = 0;

    public h0(com.tencent.mm.feature.appbrand.support.i0 i0Var, com.tencent.mm.feature.appbrand.support.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65075d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65075d;
        this.f65075d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
