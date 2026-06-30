package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270224d = 0;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270224d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270224d;
        this.f270224d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
