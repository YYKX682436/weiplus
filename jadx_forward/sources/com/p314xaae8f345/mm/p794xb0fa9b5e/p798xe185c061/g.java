package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149962d = 0;

    public g(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h hVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149962d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149962d;
        this.f149962d = i17 + 1;
        if (i17 == 0) {
            return h80.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
