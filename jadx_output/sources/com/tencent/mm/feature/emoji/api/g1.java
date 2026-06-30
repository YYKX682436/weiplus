package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class g1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66079d = 0;

    public g1(com.tencent.mm.feature.emoji.api.h1 h1Var, com.tencent.mm.feature.emoji.api.f1 f1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66079d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66079d;
        this.f66079d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
