package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150193d = 0;

    public f(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.g gVar, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150193d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150193d;
        this.f150193d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
