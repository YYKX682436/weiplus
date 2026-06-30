package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes.dex */
public class vb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172391d = 0;

    public vb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wb wbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ub ubVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172391d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172391d;
        this.f172391d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.dg.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
