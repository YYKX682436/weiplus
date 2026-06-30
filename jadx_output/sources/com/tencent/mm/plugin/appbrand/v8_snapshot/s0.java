package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes6.dex */
public class s0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90815d = 0;

    public s0(com.tencent.mm.plugin.appbrand.v8_snapshot.t0 t0Var, com.tencent.mm.plugin.appbrand.v8_snapshot.r0 r0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90815d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90815d;
        this.f90815d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
