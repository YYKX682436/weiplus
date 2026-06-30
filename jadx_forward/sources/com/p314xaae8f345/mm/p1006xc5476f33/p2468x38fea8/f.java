package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270167d = 0;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270167d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270167d;
        this.f270167d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
