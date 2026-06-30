package com.tencent.mm.feature.performance;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67527d = 0;

    public b1(com.tencent.mm.feature.performance.c1 c1Var, com.tencent.mm.feature.performance.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67527d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67527d;
        this.f67527d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.h3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
