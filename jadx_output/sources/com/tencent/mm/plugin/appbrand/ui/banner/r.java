package com.tencent.mm.plugin.appbrand.ui.banner;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89606d = 0;

    public r(com.tencent.mm.plugin.appbrand.ui.banner.s sVar, com.tencent.mm.plugin.appbrand.ui.banner.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89606d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89606d;
        this.f89606d = i17 + 1;
        if (i17 == 0) {
            return gt.h6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
