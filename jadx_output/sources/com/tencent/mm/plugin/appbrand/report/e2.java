package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes6.dex */
public class e2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f87838d = 0;

    public e2(com.tencent.mm.plugin.appbrand.report.f2 f2Var, com.tencent.mm.plugin.appbrand.report.d2 d2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87838d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f87838d;
        this.f87838d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.report.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
