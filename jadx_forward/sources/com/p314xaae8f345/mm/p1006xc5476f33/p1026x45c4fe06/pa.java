package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes6.dex */
public class pa implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f167865d = 0;

    public pa(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.qa qaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oa oaVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f167865d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f167865d;
        this.f167865d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
