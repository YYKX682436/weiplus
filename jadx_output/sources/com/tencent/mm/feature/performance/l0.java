package com.tencent.mm.feature.performance;

/* loaded from: classes6.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67600d = 0;

    public l0(com.tencent.mm.feature.performance.m0 m0Var, com.tencent.mm.feature.performance.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67600d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67600d;
        this.f67600d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
