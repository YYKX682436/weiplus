package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class j4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76486d = 0;

    public j4(com.tencent.mm.plugin.appbrand.appusage.k4 k4Var, com.tencent.mm.plugin.appbrand.appusage.i4 i4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76486d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76486d;
        this.f76486d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
