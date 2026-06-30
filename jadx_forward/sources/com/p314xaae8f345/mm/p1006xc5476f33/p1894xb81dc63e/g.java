package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f231967d = 0;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f231967d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f231967d;
        this.f231967d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
