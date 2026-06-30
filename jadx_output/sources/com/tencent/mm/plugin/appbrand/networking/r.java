package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f86126d = 0;

    public r(com.tencent.mm.plugin.appbrand.networking.s sVar, com.tencent.mm.plugin.appbrand.networking.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86126d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f86126d;
        this.f86126d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.networking.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
