package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class c9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66214d = 0;

    public c9(com.tencent.mm.feature.emoji.d9 d9Var, com.tencent.mm.feature.emoji.b9 b9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66214d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66214d;
        this.f66214d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.d4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
