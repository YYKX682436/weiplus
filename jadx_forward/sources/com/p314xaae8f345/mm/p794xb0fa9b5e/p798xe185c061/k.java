package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149968d = 0;

    public k(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.l lVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149968d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149968d;
        this.f149968d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
