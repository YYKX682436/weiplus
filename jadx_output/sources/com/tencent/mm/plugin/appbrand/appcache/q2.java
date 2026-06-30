package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes6.dex */
public class q2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75910d = 0;

    public q2(com.tencent.mm.plugin.appbrand.appcache.r2 r2Var, com.tencent.mm.plugin.appbrand.appcache.p2 p2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75910d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75910d;
        this.f75910d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.ib.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
