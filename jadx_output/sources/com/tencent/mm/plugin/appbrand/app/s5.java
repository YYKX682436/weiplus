package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class s5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75275d = 0;

    public s5(com.tencent.mm.plugin.appbrand.app.t5 t5Var, com.tencent.mm.plugin.appbrand.app.r5 r5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75275d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75275d;
        this.f75275d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.k8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
