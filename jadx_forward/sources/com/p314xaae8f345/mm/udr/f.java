package com.p314xaae8f345.mm.udr;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278016d = 0;

    public f(com.p314xaae8f345.mm.udr.g gVar, com.p314xaae8f345.mm.udr.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278016d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278016d;
        this.f278016d = i17 + 1;
        if (i17 == 0) {
            return fa5.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
