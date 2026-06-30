package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes6.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90681d = 0;

    public a1(com.tencent.mm.plugin.appbrand.v8_snapshot.b1 b1Var, com.tencent.mm.plugin.appbrand.v8_snapshot.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90681d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90681d;
        this.f90681d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
