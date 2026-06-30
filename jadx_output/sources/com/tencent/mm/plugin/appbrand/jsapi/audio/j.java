package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f79203d = 0;

    public j(com.tencent.mm.plugin.appbrand.jsapi.audio.k kVar, com.tencent.mm.plugin.appbrand.jsapi.audio.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79203d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f79203d;
        this.f79203d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.audio.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
