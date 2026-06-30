package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f81115d = 0;

    public p(com.tencent.mm.plugin.appbrand.jsapi.file.q qVar, com.tencent.mm.plugin.appbrand.jsapi.file.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81115d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f81115d;
        this.f81115d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.file.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
