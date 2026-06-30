package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66861d = 0;

    public p0(com.tencent.mm.feature.finder.live.q0 q0Var, com.tencent.mm.feature.finder.live.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66861d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66861d;
        this.f66861d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.j5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
