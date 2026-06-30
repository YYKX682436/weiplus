package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66144d = 0;

    public u0(com.tencent.mm.feature.emoji.api.v0 v0Var, com.tencent.mm.feature.emoji.api.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66144d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66144d;
        this.f66144d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
