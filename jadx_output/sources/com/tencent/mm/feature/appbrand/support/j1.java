package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class j1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65081d = 0;

    public j1(com.tencent.mm.feature.appbrand.support.k1 k1Var, com.tencent.mm.feature.appbrand.support.i1 i1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65081d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65081d;
        this.f65081d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.a2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
