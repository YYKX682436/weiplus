package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes6.dex */
public class l6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276621d = 0;

    public l6(com.p314xaae8f345.mm.p2621x8fb0427b.m6 m6Var, com.p314xaae8f345.mm.p2621x8fb0427b.k6 k6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276621d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276621d;
        this.f276621d = i17 + 1;
        switch (i17) {
            case 0:
                return br1.c.INSTANCE;
            case 1:
                return f01.h1.INSTANCE;
            case 2:
                return k41.n0.INSTANCE;
            case 3:
                return y53.p.INSTANCE;
            case 4:
                return ki4.s.INSTANCE;
            case 5:
                return bn3.j.INSTANCE;
            case 6:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.y0.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
