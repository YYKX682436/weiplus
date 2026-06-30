package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        lVar.getClass();
        if (jSONObject != null && jSONObject.optBoolean("show_wifi_download_btn", false)) {
            if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
                ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                g02.b.c(12, cVar);
            }
            jSONObject.remove("show_wifi_download_btn");
        }
        q5Var.a(str, jSONObject);
    }

    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33753x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "invokeInMM");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "addDownloadTaskStraight isTeenMode and ignore");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.a.b(context);
            q5Var.a("cancel", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("task_url");
            long optLong = jSONObject.optLong("task_size");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddDownloadTaskStraight", "url is null");
                q5Var.a("fail", null);
                return;
            }
            java.lang.String optString2 = jSONObject.optString("appid");
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
            int optInt2 = jSONObject.optInt("download_type", 1);
            int optInt3 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
            int optInt4 = jSONObject.optInt("uiarea");
            int optInt5 = jSONObject.optInt("notice_id");
            java.lang.String optString3 = jSONObject.optString("extInfo");
            boolean optBoolean = jSONObject.optBoolean("show_wifi_download_btn", false);
            g02.c cVar = new g02.c(optString2, optInt, optString3, optInt4, optInt3, optInt5, optInt2);
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(9, cVar);
            java.lang.String optString4 = jSONObject.optString("currentUrl");
            if (jSONObject.optBoolean("use_downloader_widget", false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a.b(jSONObject);
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.k(this, optBoolean, cVar, q5Var);
                ((uz.c2) a2Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.c(context, b17, optBoolean, kVar);
                return;
            }
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
                q5Var.a("fail_network_not_connected", null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.e(this, context));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, network not ready");
                return;
            }
            if (!fp.i.b()) {
                q5Var.a("sdcard_not_ready", null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f(this, context));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, sdcard not ready");
                return;
            }
            if (optLong > 0) {
                ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.a(optLong)) {
                    ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.c(optLong)) {
                        q5Var.a("has_not_enough_space", null);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.g(this, context));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + optLong);
                        return;
                    }
                }
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                g(context, jSONObject, q5Var);
                return;
            }
            if (!optBoolean) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, optString2, 4, optString4, optString, 3);
                db5.e1.D(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5x), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5q), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i(this, optString2, optString4, optString, context, jSONObject, q5Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j(this, optString2, optString4, optString, q5Var), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a.b(jSONObject);
            vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.h(this, cVar, q5Var);
            ((uz.c2) a2Var2).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.j(context, b18, hVar);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddDownloadTaskStraight", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public final void g(android.content.Context context, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        long b17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5573x98edee87 c5573x98edee87 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5573x98edee87();
        java.lang.String optString = jSONObject.optString("task_name");
        java.lang.String optString2 = jSONObject.optString("task_url");
        java.lang.String optString3 = jSONObject.optString("alternative_url");
        long optLong = jSONObject.optLong("task_size");
        java.lang.String optString4 = jSONObject.optString("file_md5");
        java.lang.String optString5 = jSONObject.optString("extInfo");
        java.lang.String optString6 = jSONObject.optString("fileType");
        java.lang.String optString7 = jSONObject.optString("appid");
        java.lang.String optString8 = jSONObject.optString("package_name");
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        int optInt2 = jSONObject.optInt("downloader_type", 1);
        int optInt3 = jSONObject.optInt("download_type", 1);
        int optInt4 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        int optInt5 = jSONObject.optInt("uiarea");
        int optInt6 = jSONObject.optInt("notice_id");
        am.oe oeVar = c5573x98edee87.f135894g;
        oeVar.f89059a = optString2;
        oeVar.f89060b = optString4;
        oeVar.f89062d = optString5;
        oeVar.f89061c = optString7;
        oeVar.f89063e = optInt;
        c5573x98edee87.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        t0Var.f178683a = optString2;
        t0Var.f178684b = optString3;
        t0Var.f178685c = optLong;
        t0Var.f178686d = optString;
        t0Var.f178687e = optString4;
        t0Var.f178689g = optString7;
        t0Var.f178690h = optString8;
        t0Var.f178691i = true;
        t0Var.f178688f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optString6, 1);
        t0Var.f178694l = optInt;
        t0Var.f178704v = optInt3;
        t0Var.f178701s = optInt4;
        t0Var.f178703u = optInt5;
        t0Var.f178702t = optInt6;
        if (optInt2 == 1) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        }
        if (b17 <= 0) {
            q5Var.a("fail", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("download_id", b17);
            q5Var.a(null, jSONObject2);
        } catch (org.json.JSONException unused) {
            q5Var.a(null, null);
        }
    }
}
