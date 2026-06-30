package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class u4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75297d = 0;

    public u4(com.tencent.mm.plugin.appbrand.app.v4 v4Var, com.tencent.mm.plugin.appbrand.app.t4 t4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75297d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75297d;
        this.f75297d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
