package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes6.dex */
public class l1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f81910d = 0;

    public l1(com.tencent.mm.plugin.appbrand.jsapi.media.m1 m1Var, com.tencent.mm.plugin.appbrand.jsapi.media.k1 k1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81910d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f81910d;
        this.f81910d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.media.i7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
