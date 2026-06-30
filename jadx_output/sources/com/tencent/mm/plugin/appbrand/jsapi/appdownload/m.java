package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f78963d = 0;

    public m(com.tencent.mm.plugin.appbrand.jsapi.appdownload.n nVar, com.tencent.mm.plugin.appbrand.jsapi.appdownload.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f78963d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f78963d;
        this.f78963d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.appdownload.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
