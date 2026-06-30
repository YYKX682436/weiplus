package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f77765d = 0;

    public i(com.tencent.mm.plugin.appbrand.debugger.j jVar, com.tencent.mm.plugin.appbrand.debugger.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f77765d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f77765d;
        this.f77765d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.debugger.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
