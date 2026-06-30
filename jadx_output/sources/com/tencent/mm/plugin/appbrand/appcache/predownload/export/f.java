package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75789d = 0;

    public f(com.tencent.mm.plugin.appbrand.appcache.predownload.export.g gVar, com.tencent.mm.plugin.appbrand.appcache.predownload.export.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75789d;
        this.f75789d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.export.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
