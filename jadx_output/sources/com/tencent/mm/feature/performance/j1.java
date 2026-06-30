package com.tencent.mm.feature.performance;

/* loaded from: classes6.dex */
public class j1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67592d = 0;

    public j1(com.tencent.mm.feature.performance.k1 k1Var, com.tencent.mm.feature.performance.i1 i1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67592d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67592d;
        this.f67592d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.v4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
