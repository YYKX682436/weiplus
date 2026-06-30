package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class s7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66475d = 0;

    public s7(com.tencent.mm.feature.emoji.t7 t7Var, com.tencent.mm.feature.emoji.r7 r7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66475d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66475d;
        this.f66475d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
