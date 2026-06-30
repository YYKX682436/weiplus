package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes6.dex */
public class lc implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89852d = 0;

    public lc(com.tencent.mm.plugin.appbrand.ui.mc mcVar, com.tencent.mm.plugin.appbrand.ui.kc kcVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89852d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89852d;
        this.f89852d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.ui.qd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
