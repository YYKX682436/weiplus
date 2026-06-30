package com.tencent.mm.feature.performance;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67781d = 0;

    public z(com.tencent.mm.feature.performance.a0 a0Var, com.tencent.mm.feature.performance.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67781d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67781d;
        this.f67781d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
