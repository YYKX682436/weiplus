package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes6.dex */
public class v3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229713d = 0;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.w3 w3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u3 u3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229713d;
        this.f229713d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.t7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
