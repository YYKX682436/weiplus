package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f85522d = 0;

    public h(com.tencent.mm.plugin.appbrand.luggage.customize.i iVar, com.tencent.mm.plugin.appbrand.luggage.customize.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85522d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f85522d;
        this.f85522d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.luggage.customize.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
