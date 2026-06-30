package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes6.dex */
public class bb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158537d = 0;

    public bb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.cb cbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ab abVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158537d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158537d;
        this.f158537d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
