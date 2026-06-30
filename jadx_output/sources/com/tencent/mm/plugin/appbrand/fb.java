package com.tencent.mm.plugin.appbrand;

/* loaded from: classes6.dex */
public class fb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f78050d = 0;

    public fb(com.tencent.mm.plugin.appbrand.gb gbVar, com.tencent.mm.plugin.appbrand.eb ebVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f78050d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f78050d;
        this.f78050d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
