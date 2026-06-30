package com.tencent.mm.plugin.appbrand;

/* loaded from: classes6.dex */
public class bb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f77004d = 0;

    public bb(com.tencent.mm.plugin.appbrand.cb cbVar, com.tencent.mm.plugin.appbrand.ab abVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f77004d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f77004d;
        this.f77004d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
