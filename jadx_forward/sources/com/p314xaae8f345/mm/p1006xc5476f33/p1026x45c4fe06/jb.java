package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes6.dex */
public class jb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f160009d = 0;

    public jb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kb kbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ib ibVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f160009d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f160009d;
        this.f160009d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
