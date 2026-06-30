package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes6.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76887d = 0;

    public p1(com.tencent.mm.plugin.appbrand.backgroundfetch.q1 q1Var, com.tencent.mm.plugin.appbrand.backgroundfetch.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76887d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76887d;
        this.f76887d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.backgroundfetch.j0.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.backgroundfetch.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
