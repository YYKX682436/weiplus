package com.p314xaae8f345.mm.p1006xc5476f33.fav;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f181768d = 0;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.fav.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.fav.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f181768d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f181768d;
        this.f181768d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.fav.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
