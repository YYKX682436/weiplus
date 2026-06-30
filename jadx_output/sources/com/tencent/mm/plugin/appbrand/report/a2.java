package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes6.dex */
public class a2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f87807d = 0;

    public a2(com.tencent.mm.plugin.appbrand.report.b2 b2Var, com.tencent.mm.plugin.appbrand.report.z1 z1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87807d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f87807d;
        this.f87807d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.trade.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
