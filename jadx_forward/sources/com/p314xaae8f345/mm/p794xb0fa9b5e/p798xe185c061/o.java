package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149972d = 0;

    public o(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p pVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149972d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149972d;
        this.f149972d = i17 + 1;
        if (i17 == 0) {
            return h80.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
