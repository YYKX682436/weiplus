package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes6.dex */
public class k0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90746d = 0;

    public k0(com.tencent.mm.plugin.appbrand.v8_snapshot.l0 l0Var, com.tencent.mm.plugin.appbrand.v8_snapshot.j0 j0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90746d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90746d;
        this.f90746d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.e2.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
