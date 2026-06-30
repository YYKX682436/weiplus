package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class a6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75012d = 0;

    public a6(com.tencent.mm.plugin.appbrand.app.b6 b6Var, com.tencent.mm.plugin.appbrand.app.z5 z5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75012d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75012d;
        this.f75012d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.n9.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.app.k9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
