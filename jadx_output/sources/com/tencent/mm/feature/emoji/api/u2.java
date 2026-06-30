package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class u2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66147d = 0;

    public u2(com.tencent.mm.feature.emoji.api.v2 v2Var, com.tencent.mm.feature.emoji.api.t2 t2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66147d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66147d;
        this.f66147d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
