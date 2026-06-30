package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75777d = 0;

    public b(com.tencent.mm.plugin.appbrand.appcache.predownload.export.c cVar, com.tencent.mm.plugin.appbrand.appcache.predownload.export.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75777d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75777d;
        this.f75777d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.export.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
