package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66649d = 0;

    public d0(com.tencent.mm.feature.finder.live.e0 e0Var, com.tencent.mm.feature.finder.live.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66649d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66649d;
        this.f66649d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.c5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
