package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class b0 implements com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t f85574a;

    /* renamed from: b, reason: collision with root package name */
    public int f85575b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f85576c;

    public b0(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f85574a = runtime;
        this.f85576c = new android.util.SparseArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "invokeData"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "performInvoke with instance("
            r0.<init>(r1)
            int r1 = r7.hashCode()
            r0.append(r1)
            java.lang.String r1 = ") appId("
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r1 = r7.f85574a
            java.lang.String r1 = r1.f74803n
            r0.append(r1)
            java.lang.String r1 = ") data("
            r0.append(r1)
            r0.append(r8)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess"
            com.tencent.mars.xlog.Log.i(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r0.<init>(r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r8 = "name"
            java.lang.String r8 = r0.optString(r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r2 = "args"
            java.lang.String r2 = r0.optString(r2)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r3 = "transitiveData"
            java.lang.String r3 = r0.optString(r3)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r4 = 0
            r5 = 1
            if (r8 == 0) goto L5a
            int r6 = r8.length()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r6 != 0) goto L58
            goto L5a
        L58:
            r6 = r4
            goto L5b
        L5a:
            r6 = r5
        L5b:
            if (r6 != 0) goto Lc6
            if (r2 == 0) goto L65
            int r6 = r2.length()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r6 != 0) goto L66
        L65:
            r4 = r5
        L66:
            if (r4 == 0) goto L69
            goto Lc6
        L69:
            java.lang.String r4 = "jsapiType"
            java.lang.String r0 = r0.optString(r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r4 = "appservice"
            boolean r4 = kotlin.jvm.internal.o.b(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r4 == 0) goto L85
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r0 = r7.f85574a     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.service.c0 r0 = r0.C0()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService"
            kotlin.jvm.internal.o.e(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f r0 = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f) r0     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            goto L9f
        L85:
            java.lang.String r4 = "webview"
            boolean r0 = kotlin.jvm.internal.o.b(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r0 == 0) goto Lb4
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r0 = r7.f85574a     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.page.d5 r0 = r0.x0()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.page.v5 r0 = r0.getPageView()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView"
            kotlin.jvm.internal.o.e(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n r0 = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) r0     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
        L9f:
            int r4 = r7.f85575b     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            int r4 = r4 + r5
            r7.f85575b = r4     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            android.util.SparseArray r5 = r7.f85576c     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y r6 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r6.<init>(r3)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r5.put(r4, r6)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r3 = ""
            r0.p0(r8, r2, r3, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            goto Lde
        Lb4:
            java.lang.String r0 = "fail invalid jsapiType"
            kotlin.jvm.internal.o.d(r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r8 = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e.a(r0, r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r7.d(r3, r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r8.<init>()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            throw r8     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
        Lc6:
            java.lang.String r8 = "fail invalid args"
            r7.d(r3, r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            return
        Lcc:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "performInvoke, json parse e = "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.mars.xlog.Log.e(r1, r8)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b0.a(java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w
    public void b(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x component, int i17, java.lang.String callbackStr) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(callbackStr, "callbackStr");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess", "onPreCallback, instance(" + hashCode() + ", callbackId(" + i17 + "), callbackStr(" + callbackStr + ')');
        c(component, i17, callbackStr);
    }

    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w
    public void c(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x component, int i17, java.lang.String data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        android.util.SparseArray sparseArray = this.f85576c;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.a0 a0Var = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.a0) sparseArray.get(i17, null);
        if (a0Var instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y) {
            sparseArray.remove(i17);
            d(((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y) a0Var).f85671a, data);
        } else if (a0Var instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.z) {
            sparseArray.remove(i17);
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t tVar = this.f85574a;
            android.app.Activity r07 = tVar.r0();
            if (r07 != null) {
                r07.moveTaskToBack(true);
            }
            tVar.l0();
        }
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess", "navigateBack, instance(" + hashCode() + "), invokeResult(" + str2 + ')');
        int i17 = this.f85575b + 1;
        this.f85575b = i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
        jSONObject2.put("transitiveData", str);
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        this.f85576c.put(i17, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.z.f85672a);
        this.f85574a.C0().p0(com.tencent.mm.plugin.appbrand.jsapi.e8.NAME, jSONObject3, "", i17);
    }
}
