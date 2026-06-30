package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes6.dex */
public class v1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f92073d = 0;

    public v1(com.tencent.mm.plugin.appbrand.widget.recent.w1 w1Var, com.tencent.mm.plugin.appbrand.widget.recent.u1 u1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f92073d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f92073d;
        this.f92073d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.widget.recent.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
