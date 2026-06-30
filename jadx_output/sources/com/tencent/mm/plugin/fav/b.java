package com.tencent.mm.plugin.fav;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100232d = 0;

    public b(com.tencent.mm.plugin.fav.c cVar, com.tencent.mm.plugin.fav.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100232d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100232d;
        this.f100232d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
