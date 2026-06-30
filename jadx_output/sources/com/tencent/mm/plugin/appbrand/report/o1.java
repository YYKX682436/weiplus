package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes6.dex */
public class o1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88128d = 0;

    public o1(com.tencent.mm.plugin.appbrand.report.p1 p1Var, com.tencent.mm.plugin.appbrand.report.n1 n1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88128d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88128d;
        this.f88128d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.report.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
