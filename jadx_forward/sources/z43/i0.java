package z43;

/* loaded from: classes.dex */
public class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public static void A(z43.i0 i0Var, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar) {
        if (str != null) {
            i0Var.f224976f.a(str);
            return;
        }
        if (jSONObject != null) {
            i0Var.getClass();
            if (jSONObject.optBoolean("show_wifi_download_btn", false)) {
                if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
                    ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                    g02.b.c(12, cVar);
                }
                jSONObject.remove("show_wifi_download_btn");
            }
        }
        i0Var.f224976f.c(jSONObject, false);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiResumeDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f224976f.a("invalid_downloadid");
            return;
        }
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        int optInt2 = jSONObject.optInt("uiarea");
        int optInt3 = jSONObject.optInt("notice_id");
        int optInt4 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        int optInt5 = jSONObject.optInt("download_type", 1);
        boolean z18 = jSONObject.optInt("ignoreNetwork", 0) == 1;
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
        boolean optBoolean = jSONObject.optBoolean("use_downloader_widget", false);
        boolean optBoolean2 = jSONObject.optBoolean("download_in_wifi", false);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (optBoolean) {
            vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
            android.content.Context c18 = c();
            z43.h0 h0Var = new z43.h0(this, cVar);
            ((uz.c2) a2Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.f(c18, optLong, optBoolean2, z18, true, h0Var);
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
            android.content.Context c19 = c();
            z43.g0 g0Var = new z43.g0(this, cVar);
            ((uz.c2) a2Var2).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.h(c19, optLong, z18, g0Var);
            return;
        }
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c27 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
        if (c27 != null && c27.f68423x7e6ed12a) {
            c27.f68423x7e6ed12a = false;
            c27.f68435x73c7b92d = true;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c27);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(optLong)) {
            this.f224976f.d(false);
        } else {
            this.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
