package com.tencent.mm.plugin.appbrand;

/* loaded from: classes.dex */
public class vb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f90858d = 0;

    public vb(com.tencent.mm.plugin.appbrand.wb wbVar, com.tencent.mm.plugin.appbrand.ub ubVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90858d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f90858d;
        this.f90858d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.dg.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
