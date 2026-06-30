package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes6.dex */
public class j0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88499d = 0;

    public j0(com.tencent.mm.plugin.appbrand.screenshot.k0 k0Var, com.tencent.mm.plugin.appbrand.screenshot.i0 i0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88499d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88499d;
        this.f88499d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.screenshot.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
