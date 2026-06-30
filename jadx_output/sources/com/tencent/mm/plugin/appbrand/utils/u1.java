package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes6.dex */
public class u1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90573d = 0;

    public u1(com.tencent.mm.plugin.appbrand.utils.v1 v1Var, com.tencent.mm.plugin.appbrand.utils.t1 t1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90573d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90573d;
        this.f90573d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.utils.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
