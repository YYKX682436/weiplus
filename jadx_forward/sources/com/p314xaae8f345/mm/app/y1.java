package com.p314xaae8f345.mm.app;

/* loaded from: classes6.dex */
public class y1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f135457d = 0;

    public y1(com.p314xaae8f345.mm.app.z1 z1Var, com.p314xaae8f345.mm.app.x1 x1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f135457d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f135457d;
        this.f135457d = i17 + 1;
        switch (i17) {
            case 0:
                return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.z2.INSTANCE;
            case 1:
                return b83.r.INSTANCE;
            case 2:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.i.INSTANCE;
            case 3:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h1.INSTANCE;
            case 4:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.s.INSTANCE;
            case 5:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.k.INSTANCE;
            case 6:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t7.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
