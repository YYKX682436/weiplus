package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes6.dex */
public class e2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75504d = 0;

    public e2(com.tencent.mm.plugin.appbrand.appcache.f2 f2Var, com.tencent.mm.plugin.appbrand.appcache.d2 d2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75504d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75504d;
        this.f75504d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.s9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
