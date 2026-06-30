package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class v1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88800d = 0;

    public v1(com.tencent.mm.plugin.appbrand.service.w1 w1Var, com.tencent.mm.plugin.appbrand.service.u1 u1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88800d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88800d;
        this.f88800d = i17 + 1;
        if (i17 == 0) {
            return ab5.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
