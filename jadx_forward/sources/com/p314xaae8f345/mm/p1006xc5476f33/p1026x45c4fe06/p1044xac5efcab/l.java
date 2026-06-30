package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158726d = 0;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158726d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158726d;
        this.f158726d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
