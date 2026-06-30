package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f77823d = 0;

    public q(com.tencent.mm.plugin.appbrand.debugger.r rVar, com.tencent.mm.plugin.appbrand.debugger.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f77823d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f77823d;
        this.f77823d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.debugger.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
