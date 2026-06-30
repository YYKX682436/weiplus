package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145033d = 0;

    public k(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l lVar, com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145033d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145033d;
        this.f145033d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
