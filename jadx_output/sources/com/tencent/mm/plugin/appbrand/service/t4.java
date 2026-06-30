package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class t4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88792d = 0;

    public t4(com.tencent.mm.plugin.appbrand.service.u4 u4Var, com.tencent.mm.plugin.appbrand.service.s4 s4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88792d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88792d;
        this.f88792d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.export.i1.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.export.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
