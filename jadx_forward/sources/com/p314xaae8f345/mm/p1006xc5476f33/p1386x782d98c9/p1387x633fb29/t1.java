package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes6.dex */
public class t1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f180598d = 0;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.s1 s1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f180598d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f180598d;
        this.f180598d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.n3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
