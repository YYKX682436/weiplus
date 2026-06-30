package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145038d = 0;

    public o(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.p pVar, com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145038d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145038d;
        this.f145038d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
