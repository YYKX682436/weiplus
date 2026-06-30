package com.tencent.mm.plugin.fav;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100235d = 0;

    public f(com.tencent.mm.plugin.fav.g gVar, com.tencent.mm.plugin.fav.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100235d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100235d;
        this.f100235d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
