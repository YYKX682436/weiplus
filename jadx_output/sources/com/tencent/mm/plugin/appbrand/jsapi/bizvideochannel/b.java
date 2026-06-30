package com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel;

/* loaded from: classes7.dex */
public final class b implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.h f80028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f80029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f80030f;

    public b(com.tencent.luggage.sdk.launching.h hVar, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f80028d = hVar;
        this.f80029e = h0Var;
        this.f80030f = appBrandRuntime;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebViewUseFastLoad", "appId:" + str + ", state:" + bVar);
        if (bVar == u81.b.BACKGROUND) {
            com.tencent.luggage.sdk.launching.h hVar = this.f80028d;
            if (hVar != null) {
                java.lang.Object obj = this.f80029e.f310123d;
                java.lang.String obj2 = obj != null ? obj.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                hVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(obj2));
            }
            this.f80030f.S();
            u81.h hVar2 = this.f80030f.N;
            if (hVar2 != null) {
                hVar2.c(this);
            }
        }
    }
}
