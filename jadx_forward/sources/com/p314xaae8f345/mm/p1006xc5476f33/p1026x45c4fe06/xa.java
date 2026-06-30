package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes6.dex */
public class xa implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f173925d = 0;

    public xa(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ya yaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wa waVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f173925d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f173925d;
        this.f173925d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
