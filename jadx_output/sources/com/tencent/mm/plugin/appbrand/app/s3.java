package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class s3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75272d = 0;

    public s3(com.tencent.mm.plugin.appbrand.app.t3 t3Var, com.tencent.mm.plugin.appbrand.app.r3 r3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75272d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75272d;
        this.f75272d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
