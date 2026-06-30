package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f79505d = 0;

    public i(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.j jVar, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79505d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f79505d;
        this.f79505d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.auth.entity.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
