package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes6.dex */
public class e0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76966d = 0;

    public e0(com.tencent.mm.plugin.appbrand.backgroundrunning.f0 f0Var, com.tencent.mm.plugin.appbrand.backgroundrunning.d0 d0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76966d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76966d;
        this.f76966d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.backgroundrunning.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
