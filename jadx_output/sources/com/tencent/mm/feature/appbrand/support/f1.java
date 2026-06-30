package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65072d = 0;

    public f1(com.tencent.mm.feature.appbrand.support.g1 g1Var, com.tencent.mm.feature.appbrand.support.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65072d;
        this.f65072d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
