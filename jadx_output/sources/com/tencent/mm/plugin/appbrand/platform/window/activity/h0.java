package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f87595d = 0;

    public h0(com.tencent.mm.plugin.appbrand.platform.window.activity.i0 i0Var, com.tencent.mm.plugin.appbrand.platform.window.activity.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87595d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f87595d;
        this.f87595d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.report.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
