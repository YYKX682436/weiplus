package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66806d = 0;

    public l0(com.tencent.mm.feature.finder.live.m0 m0Var, com.tencent.mm.feature.finder.live.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66806d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66806d;
        this.f66806d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.g5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
