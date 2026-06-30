package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class a4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66052d = 0;

    public a4(com.tencent.mm.feature.emoji.api.b4 b4Var, com.tencent.mm.feature.emoji.api.z3 z3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66052d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66052d;
        this.f66052d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.o4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
