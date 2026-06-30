package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f262990d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f262990d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f262990d;
        this.f262990d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
