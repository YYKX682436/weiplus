package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f81757d = 0;

    public d1(com.tencent.mm.plugin.appbrand.jsapi.media.e1 e1Var, com.tencent.mm.plugin.appbrand.jsapi.media.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81757d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f81757d;
        this.f81757d = i17 + 1;
        if (i17 == 0) {
            return oe1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
