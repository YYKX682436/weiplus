package com.p314xaae8f345.mm.p1006xc5476f33.biz;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f175400d = 0;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.biz.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.biz.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f175400d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f175400d;
        this.f175400d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.biz.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
