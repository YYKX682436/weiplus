package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class v4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76599d = 0;

    public v4(com.tencent.mm.plugin.appbrand.appusage.w4 w4Var, com.tencent.mm.plugin.appbrand.appusage.u4 u4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76599d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76599d;
        this.f76599d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
