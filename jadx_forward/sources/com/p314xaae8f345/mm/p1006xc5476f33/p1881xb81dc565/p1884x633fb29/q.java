package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f231611d = 0;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f231611d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f231611d;
        this.f231611d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
