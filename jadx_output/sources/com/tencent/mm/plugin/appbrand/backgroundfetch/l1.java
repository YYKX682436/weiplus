package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes6.dex */
public class l1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76858d = 0;

    public l1(com.tencent.mm.plugin.appbrand.backgroundfetch.m1 m1Var, com.tencent.mm.plugin.appbrand.backgroundfetch.k1 k1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76858d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76858d;
        this.f76858d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.backgroundfetch.y.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.backgroundfetch.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
