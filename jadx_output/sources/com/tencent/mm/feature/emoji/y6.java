package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class y6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66562d = 0;

    public y6(com.tencent.mm.feature.emoji.z6 z6Var, com.tencent.mm.feature.emoji.x6 x6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66562d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66562d;
        this.f66562d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
