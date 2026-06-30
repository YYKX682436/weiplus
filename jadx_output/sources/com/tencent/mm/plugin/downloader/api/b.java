package com.tencent.mm.plugin.downloader.api;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f96901d = 0;

    public b(com.tencent.mm.plugin.downloader.api.c cVar, com.tencent.mm.plugin.downloader.api.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96901d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f96901d;
        this.f96901d = i17 + 1;
        if (i17 == 0) {
            return a02.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
