package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class z2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f92440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f92441e;

    public z2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.util.List list) {
        this.f92441e = appBrandRuntime;
        this.f92440d = list.listIterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f92440d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (com.tencent.mm.plugin.appbrand.page.i3) this.f92440d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
