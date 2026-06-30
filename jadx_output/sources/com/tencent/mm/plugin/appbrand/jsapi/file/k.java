package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f81077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f81079g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.l f81080h;

    public k(com.tencent.mm.plugin.appbrand.jsapi.file.l lVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar2, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f81080h = lVar;
        this.f81076d = lVar2;
        this.f81077e = c0Var;
        this.f81078f = jSONObject;
        this.f81079g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var = this.f81077e;
        int i17 = this.f81079g;
        com.tencent.mm.plugin.appbrand.jsapi.file.l lVar = this.f81080h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.f81076d;
        if (lVar2.isRunning()) {
            try {
                com.tencent.mm.plugin.appbrand.jsapi.file.b0 a17 = lVar.f81090g.a(lVar2, c0Var, this.f81078f);
                if (c0Var.p()) {
                    lVar2.a(i17, lVar.v(lVar2, (com.tencent.mm.plugin.appbrand.jsruntime.t) c0Var, a17.f81320b, a17.f81319a));
                } else {
                    lVar2.a(i17, lVar.w(lVar2, a17.f81320b, a17.f81319a));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.BaseNFSApiAsync", th6, "%s.invoke, appId=%s, callbackId=%d", lVar.f81090g.getClass().getName(), lVar2.getAppId(), java.lang.Integer.valueOf(i17));
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.file.j(this, th6));
                lVar2.a(i17, lVar.o("fail:internal error"));
            }
        }
    }
}
