package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class y8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66565d = 0;

    public y8(com.tencent.mm.feature.emoji.z8 z8Var, com.tencent.mm.feature.emoji.x8 x8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66565d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66565d;
        this.f66565d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
