package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class g7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66290d = 0;

    public g7(com.tencent.mm.feature.emoji.h7 h7Var, com.tencent.mm.feature.emoji.f7 f7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66290d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66290d;
        this.f66290d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
