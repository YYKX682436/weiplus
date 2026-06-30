package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes6.dex */
public class fb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f159583d = 0;

    public fb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gb gbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.eb ebVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f159583d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f159583d;
        this.f159583d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
