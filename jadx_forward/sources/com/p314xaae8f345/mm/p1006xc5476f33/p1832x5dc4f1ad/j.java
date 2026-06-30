package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229563d = 0;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229563d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229563d;
        this.f229563d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
