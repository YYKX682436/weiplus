package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class z2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f173973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f173974e;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.util.List list) {
        this.f173974e = c11510xdd90c2f2;
        this.f173973d = list.listIterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f173973d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3) this.f173973d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
