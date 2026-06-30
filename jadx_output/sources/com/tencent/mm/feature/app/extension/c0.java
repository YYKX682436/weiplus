package com.tencent.mm.feature.app.extension;

/* loaded from: classes6.dex */
public class c0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f64987d = 0;

    public c0(com.tencent.mm.feature.app.extension.d0 d0Var, com.tencent.mm.feature.app.extension.b0 b0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f64987d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f64987d;
        this.f64987d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.app.extension.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
