package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class f3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88668d = 0;

    public f3(com.tencent.mm.plugin.appbrand.service.g3 g3Var, com.tencent.mm.plugin.appbrand.service.e3 e3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88668d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88668d;
        this.f88668d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.utils.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
