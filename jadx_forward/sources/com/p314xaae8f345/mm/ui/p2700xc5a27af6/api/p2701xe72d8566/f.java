package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290005d = 0;

    public f(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.g gVar, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290005d;
        this.f290005d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
