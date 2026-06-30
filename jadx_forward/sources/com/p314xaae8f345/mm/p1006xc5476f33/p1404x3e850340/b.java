package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f181469d = 0;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f181469d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f181469d;
        this.f181469d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
