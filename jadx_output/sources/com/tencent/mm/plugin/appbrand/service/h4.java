package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class h4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88681d = 0;

    public h4(com.tencent.mm.plugin.appbrand.service.i4 i4Var, com.tencent.mm.plugin.appbrand.service.g4 g4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88681d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88681d;
        this.f88681d = i17 + 1;
        if (i17 == 0) {
            return tg1.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
