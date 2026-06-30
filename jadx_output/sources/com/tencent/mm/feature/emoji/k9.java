package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class k9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66366d = 0;

    public k9(com.tencent.mm.feature.emoji.l9 l9Var, com.tencent.mm.feature.emoji.j9 j9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66366d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66366d;
        this.f66366d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.i4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
