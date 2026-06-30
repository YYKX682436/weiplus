package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class c7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66211d = 0;

    public c7(com.tencent.mm.feature.emoji.d7 d7Var, com.tencent.mm.feature.emoji.b7 b7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66211d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66211d;
        this.f66211d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
