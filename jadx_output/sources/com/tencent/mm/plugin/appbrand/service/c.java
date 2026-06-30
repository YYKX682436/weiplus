package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f88637d;

    public c(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        this.f88637d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f88637d.destroy();
    }
}
