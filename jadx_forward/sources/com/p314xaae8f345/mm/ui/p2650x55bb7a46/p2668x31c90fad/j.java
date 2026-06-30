package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f283504d = 0;

    public j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.k kVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f283504d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f283504d;
        this.f283504d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
