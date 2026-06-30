package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272730d = 0;

    public d(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.e eVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272730d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272730d;
        this.f272730d = i17 + 1;
        if (i17 == 0) {
            return ez.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
