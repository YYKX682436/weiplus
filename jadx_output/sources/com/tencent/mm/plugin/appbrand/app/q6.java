package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class q6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75235d = 0;

    public q6(com.tencent.mm.plugin.appbrand.app.r6 r6Var, com.tencent.mm.plugin.appbrand.app.p6 p6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75235d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75235d;
        this.f75235d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.ea.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
