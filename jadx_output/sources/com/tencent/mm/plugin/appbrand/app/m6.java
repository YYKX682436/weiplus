package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class m6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75183d = 0;

    public m6(com.tencent.mm.plugin.appbrand.app.n6 n6Var, com.tencent.mm.plugin.appbrand.app.l6 l6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75183d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75183d;
        this.f75183d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.z9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
