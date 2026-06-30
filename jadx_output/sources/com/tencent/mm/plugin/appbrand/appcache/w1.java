package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes6.dex */
public class w1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76016d = 0;

    public w1(com.tencent.mm.plugin.appbrand.appcache.x1 x1Var, com.tencent.mm.plugin.appbrand.appcache.v1 v1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76016d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76016d;
        this.f76016d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.p7.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
