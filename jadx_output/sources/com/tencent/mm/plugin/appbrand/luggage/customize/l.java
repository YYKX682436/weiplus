package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f85531d = 0;

    public l(com.tencent.mm.plugin.appbrand.luggage.customize.m mVar, com.tencent.mm.plugin.appbrand.luggage.customize.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85531d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f85531d;
        this.f85531d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.luggage.customize.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
