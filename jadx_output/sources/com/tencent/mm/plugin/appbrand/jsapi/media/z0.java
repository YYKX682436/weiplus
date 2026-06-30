package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes6.dex */
public class z0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82162d = 0;

    public z0(com.tencent.mm.plugin.appbrand.jsapi.media.a1 a1Var, com.tencent.mm.plugin.appbrand.jsapi.media.y0 y0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82162d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82162d;
        this.f82162d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.e8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
