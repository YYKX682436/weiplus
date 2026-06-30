package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class i4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75125d = 0;

    public i4(com.tencent.mm.plugin.appbrand.app.j4 j4Var, com.tencent.mm.plugin.appbrand.app.h4 h4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75125d;
        this.f75125d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.j2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
