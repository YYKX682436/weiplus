package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class i8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66334d = 0;

    public i8(com.tencent.mm.feature.emoji.j8 j8Var, com.tencent.mm.feature.emoji.h8 h8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66334d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66334d;
        this.f66334d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
