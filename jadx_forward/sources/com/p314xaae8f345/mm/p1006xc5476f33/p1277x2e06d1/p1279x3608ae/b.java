package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f175253d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f175253d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f175253d;
        this.f175253d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
