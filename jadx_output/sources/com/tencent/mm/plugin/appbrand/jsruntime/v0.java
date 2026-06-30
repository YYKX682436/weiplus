package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes6.dex */
public class v0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f84043d = 0;

    public v0(com.tencent.mm.plugin.appbrand.jsruntime.w0 w0Var, com.tencent.mm.plugin.appbrand.jsruntime.u0 u0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f84043d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f84043d;
        this.f84043d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsruntime.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
