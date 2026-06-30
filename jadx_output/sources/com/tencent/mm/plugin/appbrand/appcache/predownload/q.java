package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75885d = 0;

    public q(com.tencent.mm.plugin.appbrand.appcache.predownload.r rVar, com.tencent.mm.plugin.appbrand.appcache.predownload.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75885d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75885d;
        this.f75885d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
