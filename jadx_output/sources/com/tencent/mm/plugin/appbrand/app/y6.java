package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class y6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75348d = 0;

    public y6(com.tencent.mm.plugin.appbrand.app.z6 z6Var, com.tencent.mm.plugin.appbrand.app.x6 x6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75348d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75348d;
        this.f75348d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.ia.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
