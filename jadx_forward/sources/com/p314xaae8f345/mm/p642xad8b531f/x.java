package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145121d = 0;

    public x(com.p314xaae8f345.mm.p642xad8b531f.y yVar, com.p314xaae8f345.mm.p642xad8b531f.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145121d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145121d;
        this.f145121d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p642xad8b531f.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
