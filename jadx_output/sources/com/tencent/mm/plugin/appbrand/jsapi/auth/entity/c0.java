package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l f79488d;

    public c0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l lVar) {
        this.f79488d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l lVar = this.f79488d;
        if (lVar != null) {
            lVar.onStart();
        }
    }
}
