package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f67026d = 0;

    public x0(com.tencent.mm.feature.finder.live.y0 y0Var, com.tencent.mm.feature.finder.live.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67026d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f67026d;
        this.f67026d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.n5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
