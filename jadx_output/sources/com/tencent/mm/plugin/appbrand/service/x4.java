package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class x4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88816d = 0;

    public x4(com.tencent.mm.plugin.appbrand.service.y4 y4Var, com.tencent.mm.plugin.appbrand.service.w4 w4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88816d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88816d;
        this.f88816d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.x0.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
