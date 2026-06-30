package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class j7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276589d = 0;

    public j7(com.p314xaae8f345.mm.p2621x8fb0427b.k7 k7Var, com.p314xaae8f345.mm.p2621x8fb0427b.i7 i7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276589d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276589d;
        this.f276589d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.xa.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
