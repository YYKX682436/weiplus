package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class t3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76569d = 0;

    public t3(com.tencent.mm.plugin.appbrand.appusage.u3 u3Var, com.tencent.mm.plugin.appbrand.appusage.s3 s3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76569d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76569d;
        this.f76569d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
