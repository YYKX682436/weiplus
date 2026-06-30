package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class r4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76550d = 0;

    public r4(com.tencent.mm.plugin.appbrand.appusage.s4 s4Var, com.tencent.mm.plugin.appbrand.appusage.q4 q4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76550d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76550d;
        this.f76550d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.x.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.appusage.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
