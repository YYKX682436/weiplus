package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f240284d = 0;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f240284d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f240284d;
        this.f240284d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
