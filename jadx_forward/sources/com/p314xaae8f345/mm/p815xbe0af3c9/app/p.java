package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150044d = 0;

    public p(com.p314xaae8f345.mm.p815xbe0af3c9.app.q qVar, com.p314xaae8f345.mm.p815xbe0af3c9.app.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150044d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150044d;
        this.f150044d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p815xbe0af3c9.app.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
