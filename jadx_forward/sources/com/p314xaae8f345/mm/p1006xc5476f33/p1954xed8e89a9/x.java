package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f236268d = 0;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f236268d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f236268d;
        this.f236268d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
