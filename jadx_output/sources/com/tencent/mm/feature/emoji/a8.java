package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public class a8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66037d = 0;

    public a8(com.tencent.mm.feature.emoji.b8 b8Var, com.tencent.mm.feature.emoji.z7 z7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66037d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66037d;
        this.f66037d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
