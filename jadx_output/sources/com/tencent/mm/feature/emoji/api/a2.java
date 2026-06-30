package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class a2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66049d = 0;

    public a2(com.tencent.mm.feature.emoji.api.b2 b2Var, com.tencent.mm.feature.emoji.api.z1 z1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66049d;
        this.f66049d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
