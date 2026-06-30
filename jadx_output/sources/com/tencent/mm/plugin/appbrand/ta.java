package com.tencent.mm.plugin.appbrand;

/* loaded from: classes6.dex */
public class ta implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f88977d = 0;

    public ta(com.tencent.mm.plugin.appbrand.ua uaVar, com.tencent.mm.plugin.appbrand.sa saVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88977d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f88977d;
        this.f88977d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
