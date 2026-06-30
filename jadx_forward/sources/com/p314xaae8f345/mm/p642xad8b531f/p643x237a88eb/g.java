package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145014d = 0;

    public g(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h hVar, com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145014d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145014d;
        this.f145014d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
