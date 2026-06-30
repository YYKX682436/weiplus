package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes6.dex */
public class i0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76975d = 0;

    public i0(com.tencent.mm.plugin.appbrand.backgroundrunning.j0 j0Var, com.tencent.mm.plugin.appbrand.backgroundrunning.h0 h0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76975d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76975d;
        this.f76975d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.backgroundrunning.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
