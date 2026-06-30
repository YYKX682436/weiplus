package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75820d = 0;

    public n(com.tencent.mm.plugin.appbrand.appcache.predownload.export.o oVar, com.tencent.mm.plugin.appbrand.appcache.predownload.export.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75820d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75820d;
        this.f75820d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.export.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
