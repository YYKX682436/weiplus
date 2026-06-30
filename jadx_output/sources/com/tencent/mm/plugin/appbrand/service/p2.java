package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class p2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88740d = 0;

    public p2(com.tencent.mm.plugin.appbrand.service.q2 q2Var, com.tencent.mm.plugin.appbrand.service.o2 o2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88740d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88740d;
        this.f88740d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.wxassistant.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
