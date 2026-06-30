package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class d6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275371d = 0;

    public d6(com.p314xaae8f345.mm.p2621x8fb0427b.e6 e6Var, com.p314xaae8f345.mm.p2621x8fb0427b.c6 c6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275371d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275371d;
        this.f275371d = i17 + 1;
        if (i17 == 0) {
            return tx.c.INSTANCE;
        }
        if (i17 == 1) {
            return wr4.l.INSTANCE;
        }
        if (i17 == 2) {
            return h14.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
