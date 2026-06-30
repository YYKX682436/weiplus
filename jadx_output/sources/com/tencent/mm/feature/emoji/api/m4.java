package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public class m4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66114d = 0;

    public m4(com.tencent.mm.feature.emoji.api.n4 n4Var, com.tencent.mm.feature.emoji.api.l4 l4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66114d;
        this.f66114d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.db.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
