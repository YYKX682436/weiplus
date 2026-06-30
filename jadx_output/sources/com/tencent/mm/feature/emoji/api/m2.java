package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class m2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66111d = 0;

    public m2(com.tencent.mm.feature.emoji.api.n2 n2Var, com.tencent.mm.feature.emoji.api.l2 l2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66111d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66111d;
        this.f66111d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
