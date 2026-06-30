package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class g5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66287d = 0;

    public g5(com.tencent.mm.feature.emoji.h5 h5Var, com.tencent.mm.feature.emoji.f5 f5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66287d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66287d;
        this.f66287d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
