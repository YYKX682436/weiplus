package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes6.dex */
public class m2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f75667d = 0;

    public m2(com.tencent.mm.plugin.appbrand.appcache.n2 n2Var, com.tencent.mm.plugin.appbrand.appcache.l2 l2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f75667d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f75667d;
        this.f75667d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.za.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
