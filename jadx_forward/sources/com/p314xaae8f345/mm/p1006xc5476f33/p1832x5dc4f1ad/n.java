package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229610d = 0;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229610d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229610d;
        this.f229610d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.j6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
