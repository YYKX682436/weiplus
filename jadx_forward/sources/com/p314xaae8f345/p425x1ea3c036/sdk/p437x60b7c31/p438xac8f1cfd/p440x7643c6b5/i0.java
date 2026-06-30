package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class i0 extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 f128981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        super(mVar);
        this.f128981g = a0Var;
    }

    @Override // bl.a
    public void W(int i17) {
        this.f128981g.m0(i17);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t a(int i17) {
        return this.f128981g.V(i17);
    }

    @Override // bl.a
    public void e() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.f128981g;
        if (a0Var.F() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: component released when resumeLoopTasks");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 H = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0.H(a0Var);
        if (H == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: js thread handler not installed");
        } else {
            H.e();
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.b, bl.a
    public boolean h0(int i17, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.f128981g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.BaseAppBrandServiceLogic", "syncInitModule appId:%s, module:%s, params:%s", a0Var.N(), str, str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            try {
                jSONObject = new org.json.JSONObject(str2);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.BaseAppBrandServiceLogic", e17, "hy: param is not in json format", new java.lang.Object[0]);
            }
            return a0Var.d0(i17, str, jSONObject);
        }
        jSONObject = null;
        return a0Var.d0(i17, str, jSONObject);
    }

    @Override // bl.a
    public boolean j() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.f128981g;
        if (a0Var.F() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: component released when doInnerLoopTask");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 H = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0.H(a0Var);
        if (H != null) {
            return H.j();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: js thread handler not installed");
        return true;
    }

    @Override // bl.a
    public java.lang.String k(int i17, long j17, long j18, long j19) {
        this.f128981g.l0(i17, j17, j18, j19);
        java.lang.ref.WeakReference weakReference = this.f128917d;
        if (weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when getWorkerBaseScripts");
            return "";
        }
        java.lang.String e17 = ik1.f.e("wxa_library/android.js");
        java.lang.String e18 = ik1.f.e("wxa_library/lazy_load.js");
        org.json.JSONObject config = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) weakReference.get()).U0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        try {
            config.put("workerContentType", "app");
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WASnapshotConfigProvider", e19, "put with key(workerContentType)", new java.lang.Object[0]);
        }
        try {
            config.put("useWebWorker", true);
            config.put("nativeBufferEnabled", true);
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AbsAppBrandDelegate", e27, "put with key useWebWorker)", new java.lang.Object[0]);
        }
        return java.lang.String.format("%s;%s;%s;var __wxConfig = %s;", "(function (global) {\n   global.WeixinJSCore = {};\n   global.workerInvokeJsApi = ()=>{};\n})(this)", e17, e18, config);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.b, bl.a
    public void r0(int i17, java.lang.String str) {
        this.f128981g.h0(i17, str);
    }
}
