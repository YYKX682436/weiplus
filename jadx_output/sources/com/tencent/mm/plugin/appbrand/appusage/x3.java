package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class x3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76647d = 0;

    public x3(com.tencent.mm.plugin.appbrand.appusage.y3 y3Var, com.tencent.mm.plugin.appbrand.appusage.w3 w3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76647d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76647d;
        this.f76647d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
