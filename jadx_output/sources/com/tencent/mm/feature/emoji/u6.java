package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class u6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66502d = 0;

    public u6(com.tencent.mm.feature.emoji.v6 v6Var, com.tencent.mm.feature.emoji.t6 t6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66502d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66502d;
        this.f66502d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
