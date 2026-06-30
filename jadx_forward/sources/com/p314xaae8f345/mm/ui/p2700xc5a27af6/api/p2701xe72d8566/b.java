package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f289992d = 0;

    public b(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.c cVar, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f289992d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f289992d;
        this.f289992d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
