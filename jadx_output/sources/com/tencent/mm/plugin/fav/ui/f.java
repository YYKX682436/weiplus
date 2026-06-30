package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100841d = 0;

    public f(com.tencent.mm.plugin.fav.ui.g gVar, com.tencent.mm.plugin.fav.ui.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100841d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100841d;
        this.f100841d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.ui.e3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
