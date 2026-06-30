package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.pay.f f82596a = new com.tencent.mm.plugin.appbrand.jsapi.pay.f();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f82597b = new android.util.SparseArray();

    public static final boolean b(android.app.Activity context, yz5.l function) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(function, "function");
        return c(context, function, null);
    }

    public static final boolean c(android.app.Activity context, yz5.l function, nf.j jVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(function, "function");
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            function.invoke(context);
            return true;
        }
        try {
            int hashCode = function.hashCode();
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultRequest appBrandJsApiPayUtils$ProxyMMActivityResultRequest = new com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultRequest(hashCode);
            int startActivityRequestCode = appBrandJsApiPayUtils$ProxyMMActivityResultRequest.getStartActivityRequestCode();
            if (jVar != null) {
                nf.g.a(context).f(new com.tencent.mm.plugin.appbrand.jsapi.pay.e(startActivityRequestCode, jVar));
            }
            f82597b.put(hashCode, function);
            com.tencent.mm.plugin.appbrand.ipc.d.b(context, appBrandJsApiPayUtils$ProxyMMActivityResultRequest, null);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJsApiPayUtils", th6, "waitForMMActivityResult startLogicProxy", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0021, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r9.optString("appId")) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[Catch: Exception -> 0x00be, TRY_ENTER, TryCatch #0 {Exception -> 0x00be, blocks: (B:41:0x0019, B:10:0x003a, B:12:0x0043, B:15:0x0058, B:18:0x0060, B:22:0x0079, B:24:0x0083, B:25:0x00a0, B:27:0x00a5, B:29:0x00b6, B:30:0x00ba, B:35:0x008c, B:3:0x0023, B:5:0x0029), top: B:40:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:41:0x0019, B:10:0x003a, B:12:0x0043, B:15:0x0058, B:18:0x0060, B:22:0x0079, B:24:0x0083, B:25:0x00a0, B:27:0x00a5, B:29:0x00b6, B:30:0x00ba, B:35:0x008c, B:3:0x0023, B:5:0x0029), top: B:40:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(com.tencent.mm.plugin.appbrand.jsapi.d0 r7, org.json.JSONObject r8, org.json.JSONObject r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.String r0 = "env"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "jsapiName"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "requestPayment"
            java.lang.String r1 = "customAppId"
            r2 = 1
            java.lang.String r3 = "appId"
            r4 = 0
            if (r9 == 0) goto L23
            java.lang.String r5 = r9.optString(r3)     // Catch: java.lang.Exception -> Lbe
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto L33
        L23:
            boolean r5 = kotlin.jvm.internal.o.b(r10, r0)     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto L35
            java.lang.String r5 = r8.optString(r1)     // Catch: java.lang.Exception -> Lbe
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)     // Catch: java.lang.Exception -> Lbe
            if (r5 != 0) goto L35
        L33:
            r5 = r2
            goto L36
        L35:
            r5 = r4
        L36:
            java.lang.String r6 = "key_appbrand_from_username"
            if (r5 != 0) goto L58
            java.lang.String r9 = r7.getAppId()     // Catch: java.lang.Exception -> Lbe
            r8.put(r3, r9)     // Catch: java.lang.Exception -> Lbe
            if (r11 == 0) goto L57
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r7.getRuntime()     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r7 = r7.u0()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC"
            kotlin.jvm.internal.o.e(r7, r9)     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) r7     // Catch: java.lang.Exception -> Lbe
            java.lang.String r7 = r7.f47278x     // Catch: java.lang.Exception -> Lbe
            r8.put(r6, r7)     // Catch: java.lang.Exception -> Lbe
        L57:
            return r2
        L58:
            boolean r10 = kotlin.jvm.internal.o.b(r10, r0)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = "optString(...)"
            if (r10 == 0) goto L8c
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r7.getRuntime()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU"
            kotlin.jvm.internal.o.e(r7, r9)     // Catch: java.lang.Exception -> Lbe
            ze.n r7 = (ze.n) r7     // Catch: java.lang.Exception -> Lbe
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r7 = r7.u0()     // Catch: java.lang.Exception -> Lbe
            int r7 = r7.f47284z     // Catch: java.lang.Exception -> Lbe
            r9 = 7
            if (r7 != r9) goto L76
            r7 = r2
            goto L77
        L76:
            r7 = r4
        L77:
            if (r7 == 0) goto L8b
            java.lang.String r7 = r8.optString(r1)     // Catch: java.lang.Exception -> Lbe
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r7)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto L8b
            java.lang.String r7 = r8.optString(r1)     // Catch: java.lang.Exception -> Lbe
            kotlin.jvm.internal.o.f(r7, r0)     // Catch: java.lang.Exception -> Lbe
            goto La0
        L8b:
            return r4
        L8c:
            kotlin.jvm.internal.o.d(r9)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r9 = r9.optString(r3)     // Catch: java.lang.Exception -> Lbe
            kotlin.jvm.internal.o.f(r9, r0)     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.plugin.appbrand.jsapi.pay.f r10 = com.tencent.mm.plugin.appbrand.jsapi.pay.f.f82596a     // Catch: java.lang.Exception -> Lbe
            boolean r7 = r10.a(r7, r9)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto L9f
            return r4
        L9f:
            r7 = r9
        La0:
            r8.put(r3, r7)     // Catch: java.lang.Exception -> Lbe
            if (r11 == 0) goto Lbd
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.w9.f193053a     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.ipcinvoker.type.IPCString r10 = new com.tencent.mm.ipcinvoker.type.IPCString     // Catch: java.lang.Exception -> Lbe
            r10.<init>(r7)     // Catch: java.lang.Exception -> Lbe
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.pay.a> r7 = com.tencent.mm.plugin.appbrand.jsapi.pay.a.class
            java.lang.Object r7 = com.tencent.mm.ipcinvoker.extension.l.b(r9, r10, r7)     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.ipcinvoker.type.IPCString r7 = (com.tencent.mm.ipcinvoker.type.IPCString) r7     // Catch: java.lang.Exception -> Lbe
            if (r7 == 0) goto Lb9
            java.lang.String r7 = r7.f68406d     // Catch: java.lang.Exception -> Lbe
            goto Lba
        Lb9:
            r7 = 0
        Lba:
            r8.put(r6, r7)     // Catch: java.lang.Exception -> Lbe
        Lbd:
            return r2
        Lbe:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "wrapAppIdWithCustomAppIdLogic exp:"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "MicroMsg.AppBrandJsApiPayUtils"
            com.tencent.mars.xlog.Log.e(r8, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.pay.f.d(com.tencent.mm.plugin.appbrand.jsapi.d0, org.json.JSONObject, org.json.JSONObject, java.lang.String, boolean):boolean");
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = d0Var.getRuntime();
        if (!((runtime != null ? runtime.u0() : null) instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApiPayUtils", "isCustomAppIdValid AppBrandInitConfigWC not valid");
            return true;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = d0Var.getRuntime().u0();
        kotlin.jvm.internal.o.e(u07, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
        org.json.JSONArray optJSONArray = new org.json.JSONObject(((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) u07).N.f77455r).optJSONArray("call_plugin_info");
        if (optJSONArray == null) {
            return true;
        }
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String optString = optJSONArray.getJSONObject(i17).optString("plugin_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiPayUtils", "canRequestPaymentUseCustomAppId pluginId:%s customAppId:%s", optString, str);
            if (kotlin.jvm.internal.o.b(optString, str)) {
                return true;
            }
        }
        return false;
    }
}
