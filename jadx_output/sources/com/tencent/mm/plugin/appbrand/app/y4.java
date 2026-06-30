package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class y4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75345d = 0;

    public y4(com.tencent.mm.plugin.appbrand.app.z4 z4Var, com.tencent.mm.plugin.appbrand.app.x4 x4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75345d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75345d;
        this.f75345d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.w2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
