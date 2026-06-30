package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class n4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76522d = 0;

    public n4(com.tencent.mm.plugin.appbrand.appusage.o4 o4Var, com.tencent.mm.plugin.appbrand.appusage.m4 m4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76522d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76522d;
        this.f76522d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.a2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
