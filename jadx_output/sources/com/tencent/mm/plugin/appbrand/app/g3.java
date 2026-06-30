package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class g3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75102d = 0;

    public g3(com.tencent.mm.plugin.appbrand.app.h3 h3Var, com.tencent.mm.plugin.appbrand.app.f3 f3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75102d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75102d;
        this.f75102d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
