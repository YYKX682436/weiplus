package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class i4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66094d = 0;

    public i4(com.tencent.mm.feature.emoji.api.j4 j4Var, com.tencent.mm.feature.emoji.api.h4 h4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66094d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66094d;
        this.f66094d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.ya.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
