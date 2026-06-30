package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f263770d = 0;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f263770d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f263770d;
        this.f263770d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
