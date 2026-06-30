package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class q8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66448d = 0;

    public q8(com.tencent.mm.feature.emoji.r8 r8Var, com.tencent.mm.feature.emoji.p8 p8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66448d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66448d;
        this.f66448d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
