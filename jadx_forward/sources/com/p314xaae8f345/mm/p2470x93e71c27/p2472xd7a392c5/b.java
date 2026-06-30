package com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270232d = 0;

    public b(com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.c cVar, com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270232d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270232d;
        this.f270232d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
