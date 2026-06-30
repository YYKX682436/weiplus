package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class k5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75153d = 0;

    public k5(com.tencent.mm.plugin.appbrand.app.l5 l5Var, com.tencent.mm.plugin.appbrand.app.j5 j5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75153d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75153d;
        this.f75153d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.z7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
