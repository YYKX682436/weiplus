package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f85516d = 0;

    public d(com.tencent.mm.plugin.appbrand.luggage.customize.e eVar, com.tencent.mm.plugin.appbrand.luggage.customize.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85516d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f85516d;
        this.f85516d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.luggage.customize.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
