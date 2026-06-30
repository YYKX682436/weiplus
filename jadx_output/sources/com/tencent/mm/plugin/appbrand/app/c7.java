package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class c7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75037d = 0;

    public c7(com.tencent.mm.plugin.appbrand.app.d7 d7Var, com.tencent.mm.plugin.appbrand.app.b7 b7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75037d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75037d;
        this.f75037d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.na.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
