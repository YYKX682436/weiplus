package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class a6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66034d = 0;

    public a6(com.tencent.mm.feature.emoji.b6 b6Var, com.tencent.mm.feature.emoji.z5 z5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66034d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66034d;
        this.f66034d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
