package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class k3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66103d = 0;

    public k3(com.tencent.mm.feature.emoji.api.l3 l3Var, com.tencent.mm.feature.emoji.api.j3 j3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66103d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66103d;
        this.f66103d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.d4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
