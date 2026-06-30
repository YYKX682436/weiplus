package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76811d = 0;

    public d1(com.tencent.mm.plugin.appbrand.backgroundfetch.e1 e1Var, com.tencent.mm.plugin.appbrand.backgroundfetch.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76811d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76811d;
        this.f76811d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.backgroundfetch.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
