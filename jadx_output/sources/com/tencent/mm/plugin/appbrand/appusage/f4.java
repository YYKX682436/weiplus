package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class f4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76436d = 0;

    public f4(com.tencent.mm.plugin.appbrand.appusage.g4 g4Var, com.tencent.mm.plugin.appbrand.appusage.e4 e4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76436d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76436d;
        this.f76436d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
