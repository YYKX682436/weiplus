package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66108d = 0;

    public m0(com.tencent.mm.feature.emoji.api.n0 n0Var, com.tencent.mm.feature.emoji.api.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66108d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66108d;
        this.f66108d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
