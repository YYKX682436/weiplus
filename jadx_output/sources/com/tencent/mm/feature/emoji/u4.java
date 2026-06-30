package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class u4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66499d = 0;

    public u4(com.tencent.mm.feature.emoji.v4 v4Var, com.tencent.mm.feature.emoji.t4 t4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66499d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66499d;
        this.f66499d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
