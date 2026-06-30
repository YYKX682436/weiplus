package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f263077d = 0;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f263077d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f263077d;
        this.f263077d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
