package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class n1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65095d = 0;

    public n1(com.tencent.mm.feature.appbrand.support.o1 o1Var, com.tencent.mm.feature.appbrand.support.m1 m1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65095d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65095d;
        this.f65095d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
