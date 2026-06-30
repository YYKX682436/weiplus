package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f246231d = 0;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246231d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f246231d;
        this.f246231d = i17 + 1;
        if (i17 == 0) {
            return fa4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
