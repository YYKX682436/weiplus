package com.tencent.mm.plugin.appbrand.ui.banner;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89600d = 0;

    public j(com.tencent.mm.plugin.appbrand.ui.banner.k kVar, com.tencent.mm.plugin.appbrand.ui.banner.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89600d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89600d;
        this.f89600d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.ui.banner.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
