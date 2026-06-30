package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class z4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76671d = 0;

    public z4(com.tencent.mm.plugin.appbrand.appusage.a5 a5Var, com.tencent.mm.plugin.appbrand.appusage.y4 y4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76671d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76671d;
        this.f76671d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.a2.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.appusage.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
