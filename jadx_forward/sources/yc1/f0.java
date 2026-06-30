package yc1;

/* loaded from: classes7.dex */
public class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77519x366c91de = 507;

    /* renamed from: NAME */
    public static final java.lang.String f77520x24728b = "secureTunnel";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Intent intent;
        android.os.Bundle extras;
        int i18 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSecureTunnel", "start secureTunnel");
        yc1.d0 d0Var = new yc1.d0(this, e9Var, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        java.lang.String X1 = V0 != null ? V0.X1() : null;
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        android.app.Activity Z0 = e9Var.Z0();
        java.lang.String str = "";
        int i19 = 0;
        if (Z0 != null && (intent = Z0.getIntent()) != null && (extras = intent.getExtras()) != null) {
            java.lang.Object obj = extras.get("key_appbrand_stat_object");
            r11 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) obj).f169323f : 1000;
            java.lang.Object obj2 = extras.get("key_appbrand_init_config");
            if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) obj2;
                str = c11809xbc286be4.f128811x;
                i19 = c11809xbc286be4.L;
            }
        }
        try {
            java.lang.String string = jSONObject.getString("type");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSecureTunnel", "securetunnel type nil");
                e9Var.a(i18, o("fail"));
                return;
            }
            java.lang.String string2 = jSONObject.getString("reqbuf");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSecureTunnel", "securetunnel reqbuf nil");
                e9Var.a(i18, o("fail"));
                return;
            }
            java.lang.String string3 = jSONObject.getString("cmd");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSecureTunnel", "securetunnel cmd nil");
                e9Var.a(i18, o("fail"));
                return;
            }
            try {
                try {
                    if (!string.equals("wxpay")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback fail: invalid type");
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("err_desc", "invalid type");
                        e9Var.a(i17, p("fail", hashMap));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel doscene");
                    com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
                    lVar2.f152197a = new r45.gy5();
                    lVar2.f152198b = new r45.hy5();
                    lVar2.f152199c = "/cgi-bin/mmpay-bin/securetunnel";
                    lVar2.f152211o = 2;
                    lVar2.f152200d = 2632;
                    if (jSONObject.has("timeout")) {
                        lVar2.f152205i = jSONObject.getInt("timeout");
                    }
                    lVar2.f152211o = 2;
                    com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar2.a();
                    r45.gy5 gy5Var = (r45.gy5) a17.f152243a.f152217a;
                    gy5Var.f457178g = string2;
                    gy5Var.f457175d = string3;
                    gy5Var.f457177f = X1;
                    gy5Var.f457176e = mo48798x74292566;
                    gy5Var.f457179h = r11;
                    gy5Var.f457180i = 1;
                    gy5Var.f457181m = str;
                    gy5Var.f457182n = i19;
                    ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new yc1.e0(this, d0Var));
                } catch (org.json.JSONException unused) {
                    e9Var = lVar;
                    i18 = i17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSecureTunnel", "mini app securetunnel parameter error");
                    e9Var.a(i18, o("fail"));
                }
            } catch (org.json.JSONException unused2) {
            }
        } catch (org.json.JSONException unused3) {
        }
    }
}
