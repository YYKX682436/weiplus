package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f232033d = 0;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f232033d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f232033d;
        this.f232033d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
