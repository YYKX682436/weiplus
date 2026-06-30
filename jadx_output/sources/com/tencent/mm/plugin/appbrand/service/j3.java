package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class j3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88696d = 0;

    public j3(com.tencent.mm.plugin.appbrand.service.k3 k3Var, com.tencent.mm.plugin.appbrand.service.i3 i3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88696d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88696d;
        this.f88696d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.report.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
