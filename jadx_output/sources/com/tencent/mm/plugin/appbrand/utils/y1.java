package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes6.dex */
public class y1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90621d = 0;

    public y1(com.tencent.mm.plugin.appbrand.utils.z1 z1Var, com.tencent.mm.plugin.appbrand.utils.x1 x1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90621d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90621d;
        this.f90621d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.utils.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
