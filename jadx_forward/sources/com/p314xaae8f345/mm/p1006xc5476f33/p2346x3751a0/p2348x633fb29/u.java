package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258337d = 0;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258337d;
        this.f258337d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
