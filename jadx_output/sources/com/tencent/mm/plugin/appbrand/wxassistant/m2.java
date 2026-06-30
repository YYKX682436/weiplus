package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes6.dex */
public class m2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f92235d = 0;

    public m2(com.tencent.mm.plugin.appbrand.wxassistant.n2 n2Var, com.tencent.mm.plugin.appbrand.wxassistant.l2 l2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f92235d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f92235d;
        this.f92235d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.wxassistant.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
