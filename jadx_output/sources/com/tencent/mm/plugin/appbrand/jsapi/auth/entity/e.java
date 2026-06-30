package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f79494d = 0;

    public e(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.f fVar, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79494d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f79494d;
        this.f79494d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.auth.entity.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
