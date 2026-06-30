package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes6.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76982d = 0;

    public m0(com.tencent.mm.plugin.appbrand.backgroundrunning.n0 n0Var, com.tencent.mm.plugin.appbrand.backgroundrunning.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76982d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76982d;
        this.f76982d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.backgroundrunning.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
