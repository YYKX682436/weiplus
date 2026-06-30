package com.tencent.mm.plugin.appbrand.ui.banner;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89603d = 0;

    public n(com.tencent.mm.plugin.appbrand.ui.banner.o oVar, com.tencent.mm.plugin.appbrand.ui.banner.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89603d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89603d;
        this.f89603d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.ui.banner.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
