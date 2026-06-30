package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class o7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75216d = 0;

    public o7(com.tencent.mm.plugin.appbrand.app.p7 p7Var, com.tencent.mm.plugin.appbrand.app.n7 n7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75216d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75216d;
        this.f75216d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.cb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
