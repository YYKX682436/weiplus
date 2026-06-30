package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f263033d = 0;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f263033d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f263033d;
        this.f263033d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
