package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class o5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66418d = 0;

    public o5(com.tencent.mm.feature.emoji.p5 p5Var, com.tencent.mm.feature.emoji.n5 n5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66418d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66418d;
        this.f66418d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
