package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class o3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66121d = 0;

    public o3(com.tencent.mm.feature.emoji.api.p3 p3Var, com.tencent.mm.feature.emoji.api.n3 n3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66121d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66121d;
        this.f66121d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.g4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
