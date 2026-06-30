package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f223445d = 0;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f223445d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f223445d;
        this.f223445d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
