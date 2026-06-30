package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class q6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66445d = 0;

    public q6(com.tencent.mm.feature.emoji.r6 r6Var, com.tencent.mm.feature.emoji.p6 p6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66445d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66445d;
        this.f66445d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
