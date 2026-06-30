package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes6.dex */
public class s1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88400d = 0;

    public s1(com.tencent.mm.plugin.appbrand.report.t1 t1Var, com.tencent.mm.plugin.appbrand.report.r1 r1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88400d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88400d;
        this.f88400d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.report.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
