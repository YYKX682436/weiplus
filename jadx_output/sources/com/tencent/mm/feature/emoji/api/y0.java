package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class y0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66162d = 0;

    public y0(com.tencent.mm.feature.emoji.api.z0 z0Var, com.tencent.mm.feature.emoji.api.x0 x0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66162d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66162d;
        this.f66162d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
