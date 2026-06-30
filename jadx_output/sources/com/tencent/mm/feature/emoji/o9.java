package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class o9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66424d = 0;

    public o9(com.tencent.mm.feature.emoji.p9 p9Var, com.tencent.mm.feature.emoji.n9 n9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66424d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66424d;
        this.f66424d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
