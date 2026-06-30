package com.tencent.mm.plugin.appbrand.service;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Parcelable;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/service/AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class g<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.g f88672d = new com.tencent.mm.plugin.appbrand.service.g();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest = (com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest) obj;
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        final java.lang.String str = appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest.f88599d;
        try {
            com.tencent.mm.plugin.appbrand.appcache.e8.c(true);
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b17 = com.tencent.mm.plugin.appbrand.appcache.e8.b();
            if (com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.d() && (b17 instanceof com.tencent.mm.plugin.appbrand.appcache.AssetReader)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchPreCompileAndGenCodeCacheLogic", "not find commLib");
                if (rVar != null) {
                    rVar.a(iPCVoid);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.appbrand.service.f fVar = new com.tencent.mm.plugin.appbrand.service.f(rVar);
            com.tencent.mm.plugin.appbrand.jsruntime.t tVar = (com.tencent.mm.plugin.appbrand.jsruntime.t) new com.tencent.mm.plugin.appbrand.service.e(b17, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_node_js, 0) == 1).invoke();
            final com.tencent.mm.plugin.appbrand.service.d dVar = new com.tencent.mm.plugin.appbrand.service.d(fVar, tVar);
            com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
            final java.lang.String[] strArr = appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest.f88601f;
            if (l0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsValidationInjectorWC", "batchCompileAndGenCodeCache for appId:%s, scripts:%s, v8 addon not found", str, java.util.Arrays.toString(strArr));
                return;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
            com.tencent.mm.plugin.appbrand.appcache.ac acVar = new com.tencent.mm.plugin.appbrand.appcache.ac(new com.tencent.mm.plugin.appbrand.utils.f3(str, appBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest.f88600e), null);
            acVar.j();
            for (java.lang.String str2 : strArr) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = acVar.openReadPartialInfo(str2);
                    if (openReadPartialInfo == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsValidationInjectorWC", "batchCompileAndGenCodeCache for appId(%s) path(%s) not found", str, str2);
                    } else {
                        com.eclipsesource.mmv8.V8ScriptEvaluateRequest d17 = com.tencent.mm.plugin.appbrand.utils.e3.d(str2, openReadPartialInfo, "https://usr/" + com.tencent.mm.plugin.appbrand.appstorage.l1.i(str2));
                        d17.cacheType = 0;
                        arrayList.add(d17);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                dVar.run();
            } else {
                l0Var.W(arrayList, com.tencent.mm.plugin.appbrand.utils.e3.a(), new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.utils.e3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String arrays = java.util.Arrays.toString(strArr);
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsValidationInjectorWC", "batchCompileAndGenCodeCache for appId:%s, scripts:%s, cost %dms", str, arrays, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        java.lang.Runnable runnable = dVar;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandLaunchPreCompileAndGenCodeCacheLogic", e17, "invokePreCompileAndGenCodeCacheInAppBrandProcess", new java.lang.Object[0]);
            if (rVar != null) {
                rVar.a(iPCVoid);
            }
        }
    }
}
