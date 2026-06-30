package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class l4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88714d = 0;

    public l4(com.tencent.mm.plugin.appbrand.service.m4 m4Var, com.tencent.mm.plugin.appbrand.service.k4 k4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88714d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88714d;
        this.f88714d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.w2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
