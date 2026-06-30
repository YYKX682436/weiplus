package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes6.dex */
public class r1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65113d = 0;

    public r1(com.tencent.mm.feature.appbrand.support.s1 s1Var, com.tencent.mm.feature.appbrand.support.q1 q1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65113d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65113d;
        this.f65113d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.e2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
