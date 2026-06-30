package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class n3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88724d = 0;

    public n3(com.tencent.mm.plugin.appbrand.service.o3 o3Var, com.tencent.mm.plugin.appbrand.service.m3 m3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88724d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88724d;
        this.f88724d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelsimple.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
