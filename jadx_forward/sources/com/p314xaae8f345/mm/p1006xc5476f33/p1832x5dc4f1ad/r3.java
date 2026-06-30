package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class r3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229644d = 0;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q3 q3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229644d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229644d;
        this.f229644d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.l7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
