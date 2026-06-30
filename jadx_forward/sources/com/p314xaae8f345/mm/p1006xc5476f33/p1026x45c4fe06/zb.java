package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes.dex */
public class zb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f173987d = 0;

    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ac acVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yb ybVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f173987d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f173987d;
        this.f173987d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fg.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
