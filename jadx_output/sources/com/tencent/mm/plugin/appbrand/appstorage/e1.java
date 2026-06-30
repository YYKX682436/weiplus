package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes6.dex */
public class e1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76160d = 0;

    public e1(com.tencent.mm.plugin.appbrand.appstorage.f1 f1Var, com.tencent.mm.plugin.appbrand.appstorage.d1 d1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76160d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76160d;
        this.f76160d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appstorage.m3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
