package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class h6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276540d = 0;

    public h6(com.p314xaae8f345.mm.p2621x8fb0427b.i6 i6Var, com.p314xaae8f345.mm.p2621x8fb0427b.g6 g6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276540d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276540d;
        this.f276540d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.i5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
