package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class d4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88658d = 0;

    public d4(com.tencent.mm.plugin.appbrand.service.e4 e4Var, com.tencent.mm.plugin.appbrand.service.c4 c4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88658d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88658d;
        this.f88658d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.launching.ad.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
