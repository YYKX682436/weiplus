package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258320d = 0;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258320d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258320d;
        this.f258320d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
