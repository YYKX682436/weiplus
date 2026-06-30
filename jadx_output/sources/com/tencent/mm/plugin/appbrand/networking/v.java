package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f86139d = 0;

    public v(com.tencent.mm.plugin.appbrand.networking.w wVar, com.tencent.mm.plugin.appbrand.networking.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86139d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f86139d;
        this.f86139d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.networking.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
