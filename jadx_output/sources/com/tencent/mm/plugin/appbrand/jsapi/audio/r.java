package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f79268d = 0;

    public r(com.tencent.mm.plugin.appbrand.jsapi.audio.s sVar, com.tencent.mm.plugin.appbrand.jsapi.audio.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79268d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f79268d;
        this.f79268d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.audio.r3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
