package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272745d = 0;

    public h(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.i iVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272745d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272745d;
        this.f272745d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2614xca6eae71.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
