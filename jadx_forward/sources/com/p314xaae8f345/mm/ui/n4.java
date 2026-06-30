package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class n4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290936d = 0;

    public n4(com.p314xaae8f345.mm.ui.o4 o4Var, com.p314xaae8f345.mm.ui.m4 m4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290936d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290936d;
        this.f290936d = i17 + 1;
        switch (i17) {
            case 0:
                return fo.i.INSTANCE;
            case 1:
                return nf0.x.INSTANCE;
            case 2:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.t.INSTANCE;
            case 3:
                return gh3.k.INSTANCE;
            case 4:
                return ic2.s.INSTANCE;
            case 5:
                return pg2.o0.INSTANCE;
            case 6:
                return ic2.t0.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
