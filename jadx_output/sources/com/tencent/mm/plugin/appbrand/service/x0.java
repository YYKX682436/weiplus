package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88810d = 0;

    public x0(com.tencent.mm.plugin.appbrand.service.y0 y0Var, com.tencent.mm.plugin.appbrand.service.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88810d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88810d;
        this.f88810d = i17 + 1;
        if (i17 == 0) {
            return ab5.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
