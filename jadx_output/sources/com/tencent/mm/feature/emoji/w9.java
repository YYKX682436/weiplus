package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class w9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66531d = 0;

    public w9(com.tencent.mm.feature.emoji.x9 x9Var, com.tencent.mm.feature.emoji.v9 v9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66531d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66531d;
        this.f66531d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
