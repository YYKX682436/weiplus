package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75897d = 0;

    public u(com.tencent.mm.plugin.appbrand.appcache.predownload.v vVar, com.tencent.mm.plugin.appbrand.appcache.predownload.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75897d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75897d;
        this.f75897d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
