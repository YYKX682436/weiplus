package com.tencent.mm.plugin.appbrand.trade;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89252d = 0;

    public n(com.tencent.mm.plugin.appbrand.trade.o oVar, com.tencent.mm.plugin.appbrand.trade.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89252d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89252d;
        this.f89252d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.trade.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
