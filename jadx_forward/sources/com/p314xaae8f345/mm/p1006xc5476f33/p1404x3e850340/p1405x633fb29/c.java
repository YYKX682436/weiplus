package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f181529d = 0;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f181529d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f181529d;
        this.f181529d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
