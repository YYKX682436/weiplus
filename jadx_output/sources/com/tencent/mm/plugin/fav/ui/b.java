package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100507d = 0;

    public b(com.tencent.mm.plugin.fav.ui.c cVar, com.tencent.mm.plugin.fav.ui.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100507d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100507d;
        this.f100507d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.ui.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
