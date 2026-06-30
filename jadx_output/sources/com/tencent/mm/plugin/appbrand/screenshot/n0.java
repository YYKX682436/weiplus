package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes6.dex */
public class n0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88535d = 0;

    public n0(com.tencent.mm.plugin.appbrand.screenshot.o0 o0Var, com.tencent.mm.plugin.appbrand.screenshot.m0 m0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88535d;
        this.f88535d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.screenshot.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
