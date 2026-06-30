package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class r5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276807d = 0;

    public r5(com.p314xaae8f345.mm.p2621x8fb0427b.s5 s5Var, com.p314xaae8f345.mm.p2621x8fb0427b.q5 q5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276807d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276807d;
        this.f276807d = i17 + 1;
        if (i17 == 0) {
            return h01.w.INSTANCE;
        }
        if (i17 == 1) {
            return h01.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
