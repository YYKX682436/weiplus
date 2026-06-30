package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67676d = 0;

    public b0(com.tencent.mm.feature.performance.scheduler.c0 c0Var, com.tencent.mm.feature.performance.scheduler.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67676d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67676d;
        this.f67676d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.scheduler.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
