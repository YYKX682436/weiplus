package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes6.dex */
public class w3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75327d = 0;

    public w3(com.tencent.mm.plugin.appbrand.app.x3 x3Var, com.tencent.mm.plugin.appbrand.app.v3 v3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75327d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75327d;
        this.f75327d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
