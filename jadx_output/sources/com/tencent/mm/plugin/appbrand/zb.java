package com.tencent.mm.plugin.appbrand;

/* loaded from: classes.dex */
public class zb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f92454d = 0;

    public zb(com.tencent.mm.plugin.appbrand.ac acVar, com.tencent.mm.plugin.appbrand.yb ybVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f92454d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f92454d;
        this.f92454d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.fg.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
