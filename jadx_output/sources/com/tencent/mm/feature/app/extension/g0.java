package com.tencent.mm.feature.app.extension;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65000d = 0;

    public g0(com.tencent.mm.feature.app.extension.h0 h0Var, com.tencent.mm.feature.app.extension.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65000d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65000d;
        this.f65000d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.app.extension.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
