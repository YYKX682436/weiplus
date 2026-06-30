package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f181544d = 0;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f181544d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f181544d;
        this.f181544d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
