package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class g7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75108d = 0;

    public g7(com.tencent.mm.plugin.appbrand.app.h7 h7Var, com.tencent.mm.plugin.appbrand.app.f7 f7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75108d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75108d;
        this.f75108d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.pa.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
