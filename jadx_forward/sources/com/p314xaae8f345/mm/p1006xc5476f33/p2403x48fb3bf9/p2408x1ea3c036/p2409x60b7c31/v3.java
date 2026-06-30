package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class v3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v3 v3Var, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        v3Var.getClass();
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
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pc.f34669x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiResumeDownloadTask", "invokeInMM");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiResumeDownloadTask", "resumeDownloadTask isTeenMode and ignore");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.a.b(context);
            q5Var.a("cancel", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiResumeDownloadTask", "fail, invalid downloadId = " + optLong);
                q5Var.a("invalid_downloadid", null);
                return;
            }
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
            int optInt2 = jSONObject.optInt("uiarea");
            int optInt3 = jSONObject.optInt("notice_id");
            int optInt4 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
            int optInt5 = jSONObject.optInt("download_type", 1);
            boolean z17 = jSONObject.optInt("ignoreNetwork", 0) == 1;
            boolean optBoolean = jSONObject.optBoolean("show_wifi_download_btn", false);
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
            c17.f68432x29cbf907 = optInt;
            c17.f68444x136fa406 = optInt2;
            c17.f68427x7c4053b8 = optInt3;
            c17.f68436x2261a7a0 = optInt4;
            c17.f68410x4e46f707 = optInt5;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            g02.c cVar = new g02.c();
            cVar.a(c17);
            cVar.f348962j = 0L;
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(10, cVar);
            boolean optBoolean2 = jSONObject.optBoolean("use_downloader_widget", false);
            boolean optBoolean3 = jSONObject.optBoolean("download_in_wifi", false);
            if (optBoolean2) {
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u3 u3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u3(this, optBoolean, cVar, q5Var);
                ((uz.c2) a2Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.f(context, optLong, optBoolean3, z17, optBoolean, u3Var);
                return;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                g(jSONObject, optLong, q5Var);
                return;
            }
            if (!optBoolean) {
                db5.e1.D(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5x), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5q), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s3(this, jSONObject, optLong, q5Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t3(this, q5Var), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
                return;
            }
            vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r3 r3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r3(this, cVar, q5Var);
            ((uz.c2) a2Var2).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.h(context, optLong, z17, r3Var);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiResumeDownloadTask", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public final void g(org.json.JSONObject jSONObject, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null && c17.f68423x7e6ed12a) {
            c17.f68423x7e6ed12a = false;
            c17.f68435x73c7b92d = true;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(j17)) {
            q5Var.a(null, null);
        } else {
            q5Var.a("fail", null);
        }
    }
}
