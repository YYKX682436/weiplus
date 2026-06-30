package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66880d = 0;

    public r(com.tencent.mm.feature.finder.live.s sVar, com.tencent.mm.feature.finder.live.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66880d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66880d;
        this.f66880d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
