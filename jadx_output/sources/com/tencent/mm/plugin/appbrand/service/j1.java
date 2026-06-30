package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class j1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88693d = 0;

    public j1(com.tencent.mm.plugin.appbrand.service.k1 k1Var, com.tencent.mm.plugin.appbrand.service.i1 i1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88693d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88693d;
        this.f88693d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.z.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.app.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
