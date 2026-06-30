package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class x7 extends com.tencent.mm.plugin.appbrand.jsapi.i7 {
    private static final int CTRL_INDEX = 620;
    private static final java.lang.String NAME = "launchApplicationDirectly";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.i7, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        E(jSONObject, "invoke", "");
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        int P = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("alertType"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("operateDirectly"), 0);
        java.lang.String optString4 = jSONObject.optString("extInfo");
        java.lang.String optString5 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        java.lang.String optString6 = jSONObject.optString("installSchemeUrl");
        java.lang.String optString7 = jSONObject.optString("fileMd5");
        java.lang.String optString8 = jSONObject.optString("taskName");
        java.lang.String optString9 = jSONObject.optString("sourceInfo");
        java.lang.String optString10 = jSONObject.optString("bizInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", optString, optString2, optString4, optString3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "appid and scheme is null or nil");
            e9Var.a(i17, o("fail:appid and scheme is null or nil"));
            E(jSONObject, "fail", "fail:appid and scheme is null or nil");
            return;
        }
        java.lang.String appId = e9Var.getAppId();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 != null) {
            str = V0.X1();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "getCurrentPageView is null");
            str = null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                bundle.putString("current_page_url", java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        bundle.putString("current_page_appid", appId);
        bundle.putString("current_page_biz_info", optString10);
        bundle.putString("current_page_source_info", optString9);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.k14();
        lVar.f70665b = new r45.l14();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/checklaunchapp";
        lVar.f70667d = 1125;
        r45.k14 k14Var = (r45.k14) lVar.a().f70710a.f70684a;
        k14Var.f378292d = appId;
        k14Var.f378293e = optString;
        int i18 = ((com.tencent.mm.plugin.appbrand.o6) e9Var.t3()).l2().f87790f;
        k14Var.f378294f = i18;
        k14Var.f378295g = str;
        k14Var.f378296h = optString2;
        k14Var.f378297i = P;
        k14Var.f378298m = 1;
        k14Var.f378299n = P2;
        k14Var.f378300o = optString6;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", appId, optString, java.lang.Integer.valueOf(i18), k14Var.f378295g, k14Var.f378296h, java.lang.Integer.valueOf(k14Var.f378297i), java.lang.Integer.valueOf(k14Var.f378299n));
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.appbrand.jsapi.o7(this, e9Var, i17, optString2, optString, optString3, optString6, optString8, optString7, optString5, jSONObject, bundle, optString4));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:6:0x0005, B:9:0x0035, B:24:0x0080, B:26:0x0092, B:27:0x0098, B:29:0x009e, B:30:0x00a3, B:33:0x0074, B:34:0x0077, B:35:0x007a, B:36:0x004b, B:39:0x0055, B:42:0x005f), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:6:0x0005, B:9:0x0035, B:24:0x0080, B:26:0x0092, B:27:0x0098, B:29:0x009e, B:30:0x00a3, B:33:0x0074, B:34:0x0077, B:35:0x007a, B:36:0x004b, B:39:0x0055, B:42:0x005f), top: B:5:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(org.json.JSONObject r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            if (r13 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "bizInfo"
            java.lang.String r1 = r13.optString(r1, r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = "traceId"
            java.lang.String r7 = r13.optString(r2, r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = "frameSetName"
            java.lang.String r8 = r13.optString(r2, r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = "implType"
            java.lang.String r9 = r13.optString(r2, r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = "bizName"
            java.lang.String r5 = r13.optString(r2, r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = "bizScene"
            java.lang.String r6 = r13.optString(r2, r0)     // Catch: java.lang.Exception -> Lac
            java.lang.Class<mq0.c0> r13 = mq0.c0.class
            i95.m r13 = i95.n0.c(r13)     // Catch: java.lang.Exception -> Lac
            mq0.c0 r13 = (mq0.c0) r13     // Catch: java.lang.Exception -> Lac
            if (r13 != 0) goto L35
            return
        L35:
            int r0 = r14.hashCode()     // Catch: java.lang.Exception -> Lac
            r2 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            r3 = 2
            r4 = 1
            if (r0 == r2) goto L5f
            r2 = -1183693704(0xffffffffb9724478, float:-2.3104425E-4)
            if (r0 == r2) goto L55
            r2 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r0 == r2) goto L4b
            goto L6a
        L4b:
            java.lang.String r0 = "fail"
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Exception -> Lac
            if (r14 == 0) goto L6a
            r14 = r3
            goto L6b
        L55:
            java.lang.String r0 = "invoke"
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Exception -> Lac
            if (r14 == 0) goto L6a
            r14 = 0
            goto L6b
        L5f:
            java.lang.String r0 = "success"
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Exception -> Lac
            if (r14 == 0) goto L6a
            r14 = r4
            goto L6b
        L6a:
            r14 = -1
        L6b:
            if (r14 == 0) goto L7a
            if (r14 == r4) goto L77
            if (r14 == r3) goto L74
            r14 = 0
        L72:
            r4 = r14
            goto L7d
        L74:
            mq0.z r14 = mq0.z.f330649w     // Catch: java.lang.Exception -> Lac
            goto L72
        L77:
            mq0.z r14 = mq0.z.f330648v     // Catch: java.lang.Exception -> Lac
            goto L72
        L7a:
            mq0.z r14 = mq0.z.f330647u     // Catch: java.lang.Exception -> Lac
            goto L72
        L7d:
            if (r4 != 0) goto L80
            return
        L80:
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.lang.Exception -> Lac
            r11.<init>()     // Catch: java.lang.Exception -> Lac
            java.lang.String r14 = "apiName"
            java.lang.String r0 = "launchApplicationDirectly"
            r11.put(r14, r0)     // Catch: java.lang.Exception -> Lac
            boolean r14 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lac
            if (r14 != 0) goto L98
            java.lang.String r14 = "uxinfo"
            r11.put(r14, r1)     // Catch: java.lang.Exception -> Lac
        L98:
            boolean r14 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Exception -> Lac
            if (r14 != 0) goto La3
            java.lang.String r14 = "errMsg"
            r11.put(r14, r15)     // Catch: java.lang.Exception -> Lac
        La3:
            mq0.b0 r10 = mq0.b0.f330537e     // Catch: java.lang.Exception -> Lac
            r3 = r13
            mq0.i0 r3 = (mq0.i0) r3     // Catch: java.lang.Exception -> Lac
            r3.Ai(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lac
            goto Lb8
        Lac:
            r13 = move-exception
            java.lang.String r14 = "[MBAd] report full-link failed"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r15 = "MBADFullLinkReporter"
            com.tencent.mars.xlog.Log.e(r15, r14, r13)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.x7.E(org.json.JSONObject, java.lang.String, java.lang.String):void");
    }
}
