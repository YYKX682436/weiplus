package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f77801d = 0;

    public m(com.tencent.mm.plugin.appbrand.debugger.n nVar, com.tencent.mm.plugin.appbrand.debugger.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f77801d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f77801d;
        this.f77801d = i17 + 1;
        if (i17 == 0) {
            return q91.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
