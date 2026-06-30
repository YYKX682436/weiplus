package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class k7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75156d = 0;

    public k7(com.tencent.mm.plugin.appbrand.app.l7 l7Var, com.tencent.mm.plugin.appbrand.app.j7 j7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75156d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75156d;
        this.f75156d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.ra.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
