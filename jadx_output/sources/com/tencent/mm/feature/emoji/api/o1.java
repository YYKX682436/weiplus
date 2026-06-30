package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class o1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66118d = 0;

    public o1(com.tencent.mm.feature.emoji.api.p1 p1Var, com.tencent.mm.feature.emoji.api.n1 n1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66118d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66118d;
        this.f66118d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.storage.i5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
