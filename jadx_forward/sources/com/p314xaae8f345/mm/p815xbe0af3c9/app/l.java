package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150038d = 0;

    public l(com.p314xaae8f345.mm.p815xbe0af3c9.app.m mVar, com.p314xaae8f345.mm.p815xbe0af3c9.app.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150038d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150038d;
        this.f150038d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p815xbe0af3c9.app.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
