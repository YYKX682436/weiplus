package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class h2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88678d = 0;

    public h2(com.tencent.mm.plugin.appbrand.service.i2 i2Var, com.tencent.mm.plugin.appbrand.service.g2 g2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88678d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88678d;
        this.f88678d = i17 + 1;
        if (i17 == 0) {
            return gi1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
