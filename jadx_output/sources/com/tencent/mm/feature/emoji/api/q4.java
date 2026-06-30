package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class q4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66132d = 0;

    public q4(com.tencent.mm.feature.emoji.api.r4 r4Var, com.tencent.mm.feature.emoji.api.p4 p4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66132d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66132d;
        this.f66132d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.fb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
