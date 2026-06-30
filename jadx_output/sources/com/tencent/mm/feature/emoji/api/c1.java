package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class c1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66058d = 0;

    public c1(com.tencent.mm.feature.emoji.api.d1 d1Var, com.tencent.mm.feature.emoji.api.b1 b1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66058d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66058d;
        this.f66058d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
