package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class u6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75300d = 0;

    public u6(com.tencent.mm.plugin.appbrand.app.v6 v6Var, com.tencent.mm.plugin.appbrand.app.t6 t6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75300d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75300d;
        this.f75300d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.ga.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
