package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170671d = 0;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170671d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170671d;
        this.f170671d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
