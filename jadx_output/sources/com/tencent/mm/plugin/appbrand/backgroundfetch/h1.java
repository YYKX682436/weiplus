package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes6.dex */
public class h1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76839d = 0;

    public h1(com.tencent.mm.plugin.appbrand.backgroundfetch.i1 i1Var, com.tencent.mm.plugin.appbrand.backgroundfetch.g1 g1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76839d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76839d;
        this.f76839d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.backgroundfetch.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
