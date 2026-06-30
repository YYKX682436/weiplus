package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class e2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.f34522x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchMiniProgram", "invoke");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchMiniProgram", "data is null");
            q5Var.a("fail_null_data", null);
            return;
        }
        java.lang.String optString = e17.optString("targetAppId");
        java.lang.String optString2 = e17.optString("currentUrl");
        java.lang.String optString3 = e17.optString("preVerifyAppId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            optString3 = e17.optString("referrerAppId");
        }
        java.lang.String str2 = optString3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("invalid_targetAppId", null);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            q5Var.a("invalid_referrerAppId", null);
            return;
        }
        java.lang.String optString4 = e17.optString("envVersion");
        if (optString4 == null) {
            optString4 = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Zi(context, optString2, str2, optString, !optString4.equals("trial") ? !optString4.equals("develop") ? 0 : 1 : 2, e17.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714), 0);
        q5Var.a(null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
