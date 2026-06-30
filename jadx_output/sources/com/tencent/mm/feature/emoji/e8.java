package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class e8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66248d = 0;

    public e8(com.tencent.mm.feature.emoji.f8 f8Var, com.tencent.mm.feature.emoji.d8 d8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66248d;
        this.f66248d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
