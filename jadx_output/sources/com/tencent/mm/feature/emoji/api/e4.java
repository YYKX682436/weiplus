package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class e4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66073d = 0;

    public e4(com.tencent.mm.feature.emoji.api.f4 f4Var, com.tencent.mm.feature.emoji.api.d4 d4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66073d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66073d;
        this.f66073d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
