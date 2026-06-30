package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class i0 extends com.tencent.luggage.sdk.jsapi.component.service.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a0 f47448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var, com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        super(mVar);
        this.f47448g = a0Var;
    }

    @Override // bl.a
    public void W(int i17) {
        this.f47448g.m0(i17);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.b
    public com.tencent.mm.plugin.appbrand.jsruntime.t a(int i17) {
        return this.f47448g.V(i17);
    }

    @Override // bl.a
    public void e() {
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.f47448g;
        if (a0Var.F() == null) {
            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: component released when resumeLoopTasks");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.f0 H = com.tencent.luggage.sdk.jsapi.component.service.a0.H(a0Var);
        if (H == null) {
            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: js thread handler not installed");
        } else {
            H.e();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.b, bl.a
    public boolean h0(int i17, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject;
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.f47448g;
        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "syncInitModule appId:%s, module:%s, params:%s", a0Var.N(), str, str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                jSONObject = new org.json.JSONObject(str2);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.BaseAppBrandServiceLogic", e17, "hy: param is not in json format", new java.lang.Object[0]);
            }
            return a0Var.d0(i17, str, jSONObject);
        }
        jSONObject = null;
        return a0Var.d0(i17, str, jSONObject);
    }

    @Override // bl.a
    public boolean j() {
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.f47448g;
        if (a0Var.F() == null) {
            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: component released when doInnerLoopTask");
            return true;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.f0 H = com.tencent.luggage.sdk.jsapi.component.service.a0.H(a0Var);
        if (H != null) {
            return H.j();
        }
        com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: js thread handler not installed");
        return true;
    }

    @Override // bl.a
    public java.lang.String k(int i17, long j17, long j18, long j19) {
        this.f47448g.l0(i17, j17, j18, j19);
        java.lang.ref.WeakReference weakReference = this.f47384d;
        if (weakReference.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when getWorkerBaseScripts");
            return "";
        }
        java.lang.String e17 = ik1.f.e("wxa_library/android.js");
        java.lang.String e18 = ik1.f.e("wxa_library/lazy_load.js");
        org.json.JSONObject config = ((com.tencent.mm.plugin.appbrand.e9) weakReference.get()).U0();
        kotlin.jvm.internal.o.g(config, "config");
        try {
            config.put("workerContentType", "app");
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e19, "put with key(workerContentType)", new java.lang.Object[0]);
        }
        try {
            config.put("useWebWorker", true);
            config.put("nativeBufferEnabled", true);
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AbsAppBrandDelegate", e27, "put with key useWebWorker)", new java.lang.Object[0]);
        }
        return java.lang.String.format("%s;%s;%s;var __wxConfig = %s;", "(function (global) {\n   global.WeixinJSCore = {};\n   global.workerInvokeJsApi = ()=>{};\n})(this)", e17, e18, config);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.b, bl.a
    public void r0(int i17, java.lang.String str) {
        this.f47448g.h0(i17, str);
    }
}
