package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public class c5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66208d = 0;

    public c5(com.tencent.mm.feature.emoji.d5 d5Var, com.tencent.mm.feature.emoji.b5 b5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66208d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66208d;
        this.f66208d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
