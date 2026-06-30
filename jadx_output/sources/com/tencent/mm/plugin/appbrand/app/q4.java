package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class q4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75232d = 0;

    public q4(com.tencent.mm.plugin.appbrand.app.r4 r4Var, com.tencent.mm.plugin.appbrand.app.p4 p4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75232d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75232d;
        this.f75232d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.p2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
