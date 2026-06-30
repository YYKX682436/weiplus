package com.tencent.mm.feature.performance;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67543d = 0;

    public d0(com.tencent.mm.feature.performance.e0 e0Var, com.tencent.mm.feature.performance.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67543d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67543d;
        this.f67543d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
