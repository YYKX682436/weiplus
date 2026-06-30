package com.p314xaae8f345.mm.app;

/* loaded from: classes6.dex */
public class u1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f135353d = 0;

    public u1(com.p314xaae8f345.mm.app.v1 v1Var, com.p314xaae8f345.mm.app.t1 t1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f135353d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f135353d;
        this.f135353d = i17 + 1;
        if (i17 == 0) {
            return z33.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
