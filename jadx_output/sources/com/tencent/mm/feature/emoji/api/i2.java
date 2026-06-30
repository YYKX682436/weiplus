package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class i2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66091d = 0;

    public i2(com.tencent.mm.feature.emoji.api.j2 j2Var, com.tencent.mm.feature.emoji.api.h2 h2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66091d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66091d;
        this.f66091d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
