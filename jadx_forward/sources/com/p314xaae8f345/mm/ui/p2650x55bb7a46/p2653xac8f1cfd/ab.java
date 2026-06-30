package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes6.dex */
public class ab implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280149d = 0;

    public ab(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bb bbVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.za zaVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280149d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280149d;
        this.f280149d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.uj.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
