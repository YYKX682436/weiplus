package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65057d = 0;

    public b1(com.tencent.mm.feature.appbrand.support.c1 c1Var, com.tencent.mm.feature.appbrand.support.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65057d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65057d;
        this.f65057d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
