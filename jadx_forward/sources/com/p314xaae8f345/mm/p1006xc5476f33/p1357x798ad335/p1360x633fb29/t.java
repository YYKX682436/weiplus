package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f178682d = 0;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f178682d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f178682d;
        this.f178682d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.m.INSTANCE;
        }
        if (i17 == 1) {
            return r43.h0.INSTANCE;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
