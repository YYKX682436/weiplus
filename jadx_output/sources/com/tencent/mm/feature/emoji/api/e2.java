package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class e2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66070d = 0;

    public e2(com.tencent.mm.feature.emoji.api.f2 f2Var, com.tencent.mm.feature.emoji.api.d2 d2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66070d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66070d;
        this.f66070d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
