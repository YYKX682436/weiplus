package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class c3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66061d = 0;

    public c3(com.tencent.mm.feature.emoji.api.d3 d3Var, com.tencent.mm.feature.emoji.api.b3 b3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66061d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66061d;
        this.f66061d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.o2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
