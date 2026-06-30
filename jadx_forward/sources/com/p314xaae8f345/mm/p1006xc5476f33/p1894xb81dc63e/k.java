package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f231993d = 0;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f231993d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f231993d;
        this.f231993d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
