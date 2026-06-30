package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class b4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76389d = 0;

    public b4(com.tencent.mm.plugin.appbrand.appusage.c4 c4Var, com.tencent.mm.plugin.appbrand.appusage.a4 a4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76389d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76389d;
        this.f76389d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
