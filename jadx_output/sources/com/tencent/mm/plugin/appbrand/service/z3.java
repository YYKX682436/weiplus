package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class z3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88848d = 0;

    public z3(com.tencent.mm.plugin.appbrand.service.a4 a4Var, com.tencent.mm.plugin.appbrand.service.y3 y3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88848d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88848d;
        this.f88848d = i17 + 1;
        if (i17 == 0) {
            return k91.i4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
