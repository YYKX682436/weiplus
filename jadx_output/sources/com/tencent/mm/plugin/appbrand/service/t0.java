package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class t0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88786d = 0;

    public t0(com.tencent.mm.plugin.appbrand.service.u0 u0Var, com.tencent.mm.plugin.appbrand.service.s0 s0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88786d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88786d;
        this.f88786d = i17 + 1;
        if (i17 == 0) {
            return et.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
