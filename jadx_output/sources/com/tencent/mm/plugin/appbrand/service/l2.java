package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class l2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88711d = 0;

    public l2(com.tencent.mm.plugin.appbrand.service.m2 m2Var, com.tencent.mm.plugin.appbrand.service.k2 k2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88711d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88711d;
        this.f88711d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.n9.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.app.k9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
