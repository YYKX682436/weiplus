package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class t1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33741x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInstallDownloadTask", "invokeInOwn");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInstallDownloadTask", "data is null");
                q5Var.a("fail_invalid_data", null);
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(optLong);
            int i17 = p17.f178496f;
            if (i17 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, apilevel not supported");
                q5Var.a("fail", null);
                return;
            }
            if (i17 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, invalid status = " + p17.f178496f);
                q5Var.a("fail", null);
                return;
            }
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
            if (c17 != null) {
                int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                int optInt2 = jSONObject.optInt("uiarea");
                int optInt3 = jSONObject.optInt("notice_id");
                int optInt4 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
                c17.f68432x29cbf907 = optInt;
                c17.f68444x136fa406 = optInt2;
                c17.f68427x7c4053b8 = optInt3;
                c17.f68436x2261a7a0 = optInt4;
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            }
            vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
            long j17 = p17.f178494d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s1(this, q5Var);
            ((uz.a) f1Var).getClass();
            k02.l.a(j17, false, s1Var);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInstallDownloadTask", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
