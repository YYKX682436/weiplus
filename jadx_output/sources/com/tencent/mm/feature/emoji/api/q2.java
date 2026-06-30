package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class q2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66129d = 0;

    public q2(com.tencent.mm.feature.emoji.api.r2 r2Var, com.tencent.mm.feature.emoji.api.p2 p2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66129d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66129d;
        this.f66129d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
