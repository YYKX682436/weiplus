package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes6.dex */
public class c1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f102048d = 0;

    public c1(com.tencent.mm.plugin.finder.assist.d1 d1Var, com.tencent.mm.plugin.finder.assist.b1 b1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f102048d;
        this.f102048d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.assist.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
