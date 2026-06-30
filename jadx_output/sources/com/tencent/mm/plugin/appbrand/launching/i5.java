package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes6.dex */
public class i5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f84657d = 0;

    public i5(com.tencent.mm.plugin.appbrand.launching.j5 j5Var, com.tencent.mm.plugin.appbrand.launching.h5 h5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f84657d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f84657d;
        this.f84657d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.launching.mc.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
