package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class p6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276759d = 0;

    public p6(com.p314xaae8f345.mm.p2621x8fb0427b.q6 q6Var, com.p314xaae8f345.mm.p2621x8fb0427b.o6 o6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276759d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276759d;
        this.f276759d = i17 + 1;
        if (i17 == 0) {
            return p62.g.INSTANCE;
        }
        if (i17 == 1) {
            return on.c.INSTANCE;
        }
        if (i17 == 2) {
            return j50.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
