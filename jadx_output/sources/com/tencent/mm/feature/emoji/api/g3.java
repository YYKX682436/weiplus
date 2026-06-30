package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class g3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66082d = 0;

    public g3(com.tencent.mm.feature.emoji.api.h3 h3Var, com.tencent.mm.feature.emoji.api.f3 f3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66082d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66082d;
        this.f66082d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
