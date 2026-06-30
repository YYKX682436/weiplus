package com.tencent.mm.feature.finder.live;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66692d = 0;

    public f1(com.tencent.mm.feature.finder.live.g1 g1Var, com.tencent.mm.feature.finder.live.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66692d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66692d;
        this.f66692d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.u6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
