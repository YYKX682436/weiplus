package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75905d = 0;

    public y(com.tencent.mm.plugin.appbrand.appcache.predownload.z zVar, com.tencent.mm.plugin.appbrand.appcache.predownload.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75905d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75905d;
        this.f75905d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.predownload.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
