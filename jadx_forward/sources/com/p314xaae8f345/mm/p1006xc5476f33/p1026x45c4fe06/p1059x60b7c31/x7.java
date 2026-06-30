package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class x7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i7 {

    /* renamed from: CTRL_INDEX */
    private static final int f35008x366c91de = 620;

    /* renamed from: NAME */
    private static final java.lang.String f35009x24728b = "launchApplicationDirectly";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        E(jSONObject, "invoke", "");
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("alertType"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("operateDirectly"), 0);
        java.lang.String optString4 = jSONObject.optString("extInfo");
        java.lang.String optString5 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        java.lang.String optString6 = jSONObject.optString("installSchemeUrl");
        java.lang.String optString7 = jSONObject.optString("fileMd5");
        java.lang.String optString8 = jSONObject.optString("taskName");
        java.lang.String optString9 = jSONObject.optString("sourceInfo");
        java.lang.String optString10 = jSONObject.optString("bizInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", optString, optString2, optString4, optString3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "appid and scheme is null or nil");
            e9Var.a(i17, o("fail:appid and scheme is null or nil"));
            E(jSONObject, "fail", "fail:appid and scheme is null or nil");
            return;
        }
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 != null) {
            str = V0.X1();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "getCurrentPageView is null");
            str = null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                bundle.putString("current_page_url", java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        bundle.putString("current_page_appid", mo48798x74292566);
        bundle.putString("current_page_biz_info", optString10);
        bundle.putString("current_page_source_info", optString9);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.k14();
        lVar.f152198b = new r45.l14();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/checklaunchapp";
        lVar.f152200d = 1125;
        r45.k14 k14Var = (r45.k14) lVar.a().f152243a.f152217a;
        k14Var.f459825d = mo48798x74292566;
        k14Var.f459826e = optString;
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) e9Var.t3()).l2().f169323f;
        k14Var.f459827f = i18;
        k14Var.f459828g = str;
        k14Var.f459829h = optString2;
        k14Var.f459830i = P;
        k14Var.f459831m = 1;
        k14Var.f459832n = P2;
        k14Var.f459833o = optString6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", mo48798x74292566, optString, java.lang.Integer.valueOf(i18), k14Var.f459828g, k14Var.f459829h, java.lang.Integer.valueOf(k14Var.f459830i), java.lang.Integer.valueOf(k14Var.f459832n));
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7(this, e9Var, i17, optString2, optString, optString3, optString6, optString8, optString7, optString5, jSONObject, bundle, optString4));
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
            mq0.z r14 = mq0.z.f412182w     // Catch: java.lang.Exception -> Lac
            goto L72
        L77:
            mq0.z r14 = mq0.z.f412181v     // Catch: java.lang.Exception -> Lac
            goto L72
        L7a:
            mq0.z r14 = mq0.z.f412180u     // Catch: java.lang.Exception -> Lac
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
            mq0.b0 r10 = mq0.b0.f412070e     // Catch: java.lang.Exception -> Lac
            r3 = r13
            mq0.i0 r3 = (mq0.i0) r3     // Catch: java.lang.Exception -> Lac
            r3.Ai(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lac
            goto Lb8
        Lac:
            r13 = move-exception
            java.lang.String r14 = "[MBAd] report full-link failed"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r15 = "MBADFullLinkReporter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r15, r14, r13)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x7.E(org.json.JSONObject, java.lang.String, java.lang.String):void");
    }
}
