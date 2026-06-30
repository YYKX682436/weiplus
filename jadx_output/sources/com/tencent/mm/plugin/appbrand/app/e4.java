package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class e4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75065d = 0;

    public e4(com.tencent.mm.plugin.appbrand.app.f4 f4Var, com.tencent.mm.plugin.appbrand.app.d4 d4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75065d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75065d;
        this.f75065d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
