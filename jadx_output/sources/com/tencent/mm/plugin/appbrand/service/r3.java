package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public class r3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88770d = 0;

    public r3(com.tencent.mm.plugin.appbrand.service.s3 s3Var, com.tencent.mm.plugin.appbrand.service.q3 q3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88770d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88770d;
        this.f88770d = i17 + 1;
        if (i17 == 0) {
            return ak5.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
