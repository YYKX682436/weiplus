package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90711d = 0;

    public g0(com.tencent.mm.plugin.appbrand.v8_snapshot.h0 h0Var, com.tencent.mm.plugin.appbrand.v8_snapshot.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90711d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90711d;
        this.f90711d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.v8_snapshot.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
