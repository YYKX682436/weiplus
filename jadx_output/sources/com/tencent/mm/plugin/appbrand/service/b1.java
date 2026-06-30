package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88631d = 0;

    public b1(com.tencent.mm.plugin.appbrand.service.c1 c1Var, com.tencent.mm.plugin.appbrand.service.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88631d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88631d;
        this.f88631d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
