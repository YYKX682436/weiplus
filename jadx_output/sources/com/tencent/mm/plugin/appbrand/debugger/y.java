package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f77845d = 0;

    public y(com.tencent.mm.plugin.appbrand.debugger.z zVar, com.tencent.mm.plugin.appbrand.debugger.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f77845d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f77845d;
        this.f77845d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.debugger.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
