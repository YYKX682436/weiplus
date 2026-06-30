package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class t6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276860d = 0;

    public t6(com.p314xaae8f345.mm.p2621x8fb0427b.u6 u6Var, com.p314xaae8f345.mm.p2621x8fb0427b.s6 s6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276860d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276860d;
        this.f276860d = i17 + 1;
        if (i17 == 0) {
            return bt.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
