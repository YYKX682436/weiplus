package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f47569d = 0;

    public b(com.tencent.luggage.sdk.jsapi.component.webaudio.c cVar, com.tencent.luggage.sdk.jsapi.component.webaudio.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f47569d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f47569d;
        this.f47569d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.audio.r3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
