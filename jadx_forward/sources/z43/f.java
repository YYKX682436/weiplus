package z43;

/* loaded from: classes.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public static void A(z43.f fVar, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar) {
        if (str != null) {
            fVar.f224976f.a(str);
            return;
        }
        if (jSONObject != null) {
            fVar.getClass();
            if (jSONObject.optBoolean("show_wifi_download_btn", false)) {
                if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
                    ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                    g02.b.c(12, cVar);
                }
                jSONObject.remove("show_wifi_download_btn");
            }
        }
        fVar.f224976f.c(jSONObject, false);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long b17;
        java.lang.String optString = jSONObject.optString("task_url");
        long optLong = jSONObject.optLong("task_size");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiAddDownloadTaskStraight", "url is null");
            this.f224976f.a("uri is null");
            return;
        }
        java.lang.String optString2 = jSONObject.optString("appid");
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        int optInt2 = jSONObject.optInt("download_type", 1);
        g02.c cVar = new g02.c(optString2, optInt, jSONObject.optString("extInfo"), jSONObject.optInt("uiarea"), jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f), jSONObject.optInt("notice_id"), optInt2);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(9, cVar);
        jSONObject.optString("currentUrl");
        if (jSONObject.optBoolean("use_downloader_widget", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a.b(jSONObject);
            vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
            android.content.Context c17 = c();
            z43.e eVar = new z43.e(this, cVar);
            ((uz.c2) a2Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.c(c17, b18, true, eVar);
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(context)) {
            this.f224976f.a("fail_network_not_connected");
            ((ku5.t0) ku5.t0.f394148d).B(new z43.a(this, context));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddDownloadTaskStraight", " fail, network not ready");
        } else {
            if (fp.i.b()) {
                if (optLong > 0) {
                    ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.a(optLong)) {
                        ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.c(optLong)) {
                            this.f224976f.a("has_not_enough_space");
                            ((ku5.t0) ku5.t0.f394148d).B(new z43.c(this, context));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + optLong);
                        }
                    }
                }
                if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a b19 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a.b(jSONObject);
                    vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
                    android.content.Context c18 = c();
                    z43.d dVar = new z43.d(this, cVar);
                    ((uz.c2) a2Var2).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.j(c18, b19, dVar);
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5573x98edee87 c5573x98edee87 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5573x98edee87();
                java.lang.String optString3 = jSONObject.optString("task_name");
                java.lang.String optString4 = jSONObject.optString("task_url");
                java.lang.String optString5 = jSONObject.optString("alternative_url");
                long optLong2 = jSONObject.optLong("task_size");
                java.lang.String optString6 = jSONObject.optString("file_md5");
                java.lang.String optString7 = jSONObject.optString("extInfo");
                java.lang.String optString8 = jSONObject.optString("fileType");
                java.lang.String optString9 = jSONObject.optString("appid");
                java.lang.String optString10 = jSONObject.optString("package_name");
                int optInt3 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
                int optInt4 = jSONObject.optInt("downloader_type", 1);
                int optInt5 = jSONObject.optInt("download_type", 1);
                int optInt6 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
                int optInt7 = jSONObject.optInt("uiarea");
                int optInt8 = jSONObject.optInt("notice_id");
                am.oe oeVar = c5573x98edee87.f135894g;
                oeVar.f89059a = optString4;
                oeVar.f89060b = optString6;
                oeVar.f89062d = optString7;
                oeVar.f89061c = optString9;
                oeVar.f89063e = optInt3;
                c5573x98edee87.e();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
                t0Var.f178683a = optString4;
                t0Var.f178684b = optString5;
                t0Var.f178685c = optLong2;
                t0Var.f178686d = optString3;
                t0Var.f178687e = optString6;
                t0Var.f178689g = optString9;
                t0Var.f178690h = optString10;
                t0Var.f178691i = true;
                t0Var.f178688f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optString8, 1);
                t0Var.f178694l = optInt3;
                t0Var.f178704v = optInt5;
                t0Var.f178701s = optInt6;
                t0Var.f178703u = optInt7;
                t0Var.f178702t = optInt8;
                if (optInt4 == 1) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
                }
                if (b17 <= 0) {
                    this.f224976f.a("fail");
                    return;
                }
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("download_id", b17);
                    this.f224976f.c(jSONObject2, false);
                    return;
                } catch (org.json.JSONException unused) {
                    this.f224976f.a("exception");
                    return;
                }
            }
            this.f224976f.a("sdcard_not_ready");
            ((ku5.t0) ku5.t0.f394148d).B(new z43.b(this, context));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddDownloadTaskStraight", " fail, sdcard not ready");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
