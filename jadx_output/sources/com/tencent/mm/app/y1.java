package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class y1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53924d = 0;

    public y1(com.tencent.mm.app.z1 z1Var, com.tencent.mm.app.x1 x1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53924d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53924d;
        this.f53924d = i17 + 1;
        switch (i17) {
            case 0:
                return com.tencent.mm.feature.performance.z2.INSTANCE;
            case 1:
                return b83.r.INSTANCE;
            case 2:
                return com.tencent.mm.plugin.appbrand.app.i.INSTANCE;
            case 3:
                return com.tencent.mm.plugin.appbrand.h1.INSTANCE;
            case 4:
                return com.tencent.mm.plugin.appbrand.luggage.customize.s.INSTANCE;
            case 5:
                return com.tencent.mm.plugin.appbrand.app.k.INSTANCE;
            case 6:
                return com.tencent.mm.plugin.appbrand.app.t7.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
