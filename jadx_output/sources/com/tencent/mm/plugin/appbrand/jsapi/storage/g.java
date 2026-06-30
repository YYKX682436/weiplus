package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83384e;

    public g(com.tencent.mm.plugin.appbrand.jsapi.storage.h hVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f83383d = lVar;
        this.f83384e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f83383d;
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.getAppId(), z0Var.f305853s, z0Var.f305855u).k(this.f83384e, lVar.getAppId());
    }
}
