package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class o7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66421d = 0;

    public o7(com.tencent.mm.feature.emoji.p7 p7Var, com.tencent.mm.feature.emoji.n7 n7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66421d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66421d;
        this.f66421d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
