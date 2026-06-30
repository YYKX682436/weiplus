package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes6.dex */
public class rb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f169296d = 0;

    public rb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sb sbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.qb qbVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f169296d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f169296d;
        this.f169296d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.k8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
