package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class y2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66165d = 0;

    public y2(com.tencent.mm.feature.emoji.api.z2 z2Var, com.tencent.mm.feature.emoji.api.x2 x2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66165d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66165d;
        this.f66165d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
