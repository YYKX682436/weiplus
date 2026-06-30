package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class r1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88767d = 0;

    public r1(com.tencent.mm.plugin.appbrand.service.s1 s1Var, com.tencent.mm.plugin.appbrand.service.q1 q1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88767d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88767d;
        this.f88767d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
