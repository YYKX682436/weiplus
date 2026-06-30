package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class i6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66331d = 0;

    public i6(com.tencent.mm.feature.emoji.j6 j6Var, com.tencent.mm.feature.emoji.h6 h6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66331d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66331d;
        this.f66331d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
