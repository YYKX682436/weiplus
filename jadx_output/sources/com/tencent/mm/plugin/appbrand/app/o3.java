package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class o3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75210d = 0;

    public o3(com.tencent.mm.plugin.appbrand.app.p3 p3Var, com.tencent.mm.plugin.appbrand.app.n3 n3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75210d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75210d;
        this.f75210d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
