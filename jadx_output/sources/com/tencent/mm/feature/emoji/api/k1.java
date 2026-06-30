package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class k1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66100d = 0;

    public k1(com.tencent.mm.feature.emoji.api.l1 l1Var, com.tencent.mm.feature.emoji.api.j1 j1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66100d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66100d;
        this.f66100d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
