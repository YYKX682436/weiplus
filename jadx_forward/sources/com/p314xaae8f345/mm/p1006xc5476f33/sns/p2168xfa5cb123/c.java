package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f246374d = 0;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246374d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f246374d;
        this.f246374d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
