package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f83112d = 0;

    public b(com.tencent.mm.plugin.appbrand.jsapi.share.c cVar, com.tencent.mm.plugin.appbrand.jsapi.share.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f83112d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f83112d;
        this.f83112d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.share.j3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
