package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class k3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75150d = 0;

    public k3(com.tencent.mm.plugin.appbrand.app.l3 l3Var, com.tencent.mm.plugin.appbrand.app.j3 j3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75150d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75150d;
        this.f75150d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
