package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class s5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66472d = 0;

    public s5(com.tencent.mm.feature.emoji.t5 t5Var, com.tencent.mm.feature.emoji.r5 r5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66472d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66472d;
        this.f66472d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
