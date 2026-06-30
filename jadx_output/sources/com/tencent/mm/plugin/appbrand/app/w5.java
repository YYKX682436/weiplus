package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class w5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75330d = 0;

    public w5(com.tencent.mm.plugin.appbrand.app.x5 x5Var, com.tencent.mm.plugin.appbrand.app.v5 v5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75330d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75330d;
        this.f75330d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.k9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
