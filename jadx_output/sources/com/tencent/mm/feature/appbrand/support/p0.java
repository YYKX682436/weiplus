package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65098d = 0;

    public p0(com.tencent.mm.feature.appbrand.support.q0 q0Var, com.tencent.mm.feature.appbrand.support.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65098d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65098d;
        this.f65098d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
