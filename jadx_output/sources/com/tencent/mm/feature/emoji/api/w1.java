package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class w1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66154d = 0;

    public w1(com.tencent.mm.feature.emoji.api.x1 x1Var, com.tencent.mm.feature.emoji.api.v1 v1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66154d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66154d;
        this.f66154d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
