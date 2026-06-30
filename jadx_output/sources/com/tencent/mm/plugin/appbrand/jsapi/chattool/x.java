package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f80476d = 0;

    public x(com.tencent.mm.plugin.appbrand.jsapi.chattool.y yVar, com.tencent.mm.plugin.appbrand.jsapi.chattool.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80476d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f80476d;
        this.f80476d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.chattool.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
