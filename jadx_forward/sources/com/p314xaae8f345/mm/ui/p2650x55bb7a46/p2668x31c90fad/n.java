package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f283507d = 0;

    public n(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.o oVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f283507d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f283507d;
        this.f283507d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
