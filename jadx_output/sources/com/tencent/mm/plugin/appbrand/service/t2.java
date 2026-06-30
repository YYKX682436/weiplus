package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class t2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88789d = 0;

    public t2(com.tencent.mm.plugin.appbrand.service.u2 u2Var, com.tencent.mm.plugin.appbrand.service.s2 s2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88789d;
        this.f88789d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.wxassistant.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
