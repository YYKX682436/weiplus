package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66614d = 0;

    public b1(com.tencent.mm.feature.finder.live.c1 c1Var, com.tencent.mm.feature.finder.live.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66614d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66614d;
        this.f66614d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.a6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
