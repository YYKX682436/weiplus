package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f97149d = 0;

    public t(com.tencent.mm.plugin.downloader.model.u uVar, com.tencent.mm.plugin.downloader.model.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f97149d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f97149d;
        this.f97149d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.model.silent_download.m.INSTANCE;
        }
        if (i17 == 1) {
            return r43.h0.INSTANCE;
        }
        if (i17 == 2) {
            return com.tencent.mm.plugin.appbrand.jsapi.appdownload.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
