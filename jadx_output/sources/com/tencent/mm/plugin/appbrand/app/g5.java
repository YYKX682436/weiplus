package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class g5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75105d = 0;

    public g5(com.tencent.mm.plugin.appbrand.app.h5 h5Var, com.tencent.mm.plugin.appbrand.app.f5 f5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75105d;
        this.f75105d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.v7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
