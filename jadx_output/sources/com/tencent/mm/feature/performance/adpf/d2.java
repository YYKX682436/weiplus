package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes6.dex */
public class d2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67412d = 0;

    public d2(com.tencent.mm.feature.performance.adpf.e2 e2Var, com.tencent.mm.feature.performance.adpf.c2 c2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67412d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67412d;
        this.f67412d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.adpf.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
