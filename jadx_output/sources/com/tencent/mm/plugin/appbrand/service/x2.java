package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class x2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88813d = 0;

    public x2(com.tencent.mm.plugin.appbrand.service.y2 y2Var, com.tencent.mm.plugin.appbrand.service.w2 w2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88813d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88813d;
        this.f88813d = i17 + 1;
        if (i17 == 0) {
            return lm1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
