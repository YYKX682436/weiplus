package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class p4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88743d = 0;

    public p4(com.tencent.mm.plugin.appbrand.service.q4 q4Var, com.tencent.mm.plugin.appbrand.service.o4 o4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88743d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88743d;
        this.f88743d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.export.d0.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.export.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
