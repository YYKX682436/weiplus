package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class c5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75034d = 0;

    public c5(com.tencent.mm.plugin.appbrand.app.d5 d5Var, com.tencent.mm.plugin.appbrand.app.b5 b5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75034d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75034d;
        this.f75034d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.t7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
