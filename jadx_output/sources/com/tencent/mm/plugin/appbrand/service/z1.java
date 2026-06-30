package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class z1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88845d = 0;

    public z1(com.tencent.mm.plugin.appbrand.service.a2 a2Var, com.tencent.mm.plugin.appbrand.service.y1 y1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88845d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88845d;
        this.f88845d = i17 + 1;
        if (i17 == 0) {
            return zh1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
