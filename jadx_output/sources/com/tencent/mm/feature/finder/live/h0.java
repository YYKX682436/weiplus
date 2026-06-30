package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66738d = 0;

    public h0(com.tencent.mm.feature.finder.live.i0 i0Var, com.tencent.mm.feature.finder.live.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66738d;
        this.f66738d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.e5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
