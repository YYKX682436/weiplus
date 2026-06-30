package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class m8 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66395d = 0;

    public m8(com.tencent.mm.feature.emoji.n8 n8Var, com.tencent.mm.feature.emoji.l8 l8Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66395d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66395d;
        this.f66395d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
