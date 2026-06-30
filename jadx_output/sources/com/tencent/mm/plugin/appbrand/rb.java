package com.tencent.mm.plugin.appbrand;

/* loaded from: classes6.dex */
public class rb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f87763d = 0;

    public rb(com.tencent.mm.plugin.appbrand.sb sbVar, com.tencent.mm.plugin.appbrand.qb qbVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87763d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f87763d;
        this.f87763d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.k8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
