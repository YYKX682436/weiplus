package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class e6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75068d = 0;

    public e6(com.tencent.mm.plugin.appbrand.app.f6 f6Var, com.tencent.mm.plugin.appbrand.app.d6 d6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75068d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75068d;
        this.f75068d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.q9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
