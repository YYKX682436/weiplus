package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes6.dex */
public class m5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f84781d = 0;

    public m5(com.tencent.mm.plugin.appbrand.launching.n5 n5Var, com.tencent.mm.plugin.appbrand.launching.l5 l5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f84781d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f84781d;
        this.f84781d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.launching.ad.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
