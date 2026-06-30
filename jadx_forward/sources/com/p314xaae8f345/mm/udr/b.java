package com.p314xaae8f345.mm.udr;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278003d = 0;

    public b(com.p314xaae8f345.mm.udr.c cVar, com.p314xaae8f345.mm.udr.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278003d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278003d;
        this.f278003d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.udr.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
