package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f170539d = 0;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f170539d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f170539d;
        this.f170539d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
