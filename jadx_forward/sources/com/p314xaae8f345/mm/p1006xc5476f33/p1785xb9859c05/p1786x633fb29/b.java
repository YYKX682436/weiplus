package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f223994d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f223994d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f223994d;
        this.f223994d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
