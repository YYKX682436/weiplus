package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170785d = 0;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170785d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170785d;
        this.f170785d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
