package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes6.dex */
public class c1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f245645d = 0;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b1 b1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f245645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f245645d;
        this.f245645d = i17 + 1;
        if (i17 == 0) {
            return ge0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
