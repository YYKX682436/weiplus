package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.b0 f83381g;

    public a0(com.tencent.mm.plugin.appbrand.jsapi.storage.b0 b0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str) {
        this.f83381g = b0Var;
        this.f83378d = lVar;
        this.f83379e = i17;
        this.f83380f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f83378d;
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        oe.a aVar = (oe.a) nd.f.a(oe.a.class);
        com.tencent.mm.plugin.appbrand.jsapi.storage.b0 b0Var = this.f83381g;
        ((com.tencent.mm.plugin.appbrand.luggage.customize.b) aVar).b(b0Var.C(lVar), z0Var.f305853s, z0Var.f305855u).q(this.f83379e, b0Var.C(lVar), this.f83380f);
    }
}
