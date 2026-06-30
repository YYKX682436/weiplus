package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class y2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75342d = 0;

    public y2(com.tencent.mm.plugin.appbrand.app.z2 z2Var, com.tencent.mm.plugin.appbrand.app.x2 x2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75342d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75342d;
        this.f75342d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
