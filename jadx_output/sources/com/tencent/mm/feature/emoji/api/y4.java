package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class y4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66168d = 0;

    public y4(com.tencent.mm.feature.emoji.api.z4 z4Var, com.tencent.mm.feature.emoji.api.x4 x4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66168d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66168d;
        this.f66168d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.hb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
