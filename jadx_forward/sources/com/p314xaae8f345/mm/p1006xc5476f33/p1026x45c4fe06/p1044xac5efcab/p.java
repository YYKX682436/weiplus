package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158729d = 0;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158729d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158729d;
        this.f158729d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
