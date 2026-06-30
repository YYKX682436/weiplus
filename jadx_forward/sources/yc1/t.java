package yc1;

/* loaded from: classes7.dex */
public final class t implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc1.u f542345c;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, yc1.u uVar) {
        this.f542343a = c0Var;
        this.f542344b = i17;
        this.f542345c = uVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.lang.String str2;
        java.lang.String str3;
        rk0.c.c("MicroMsg.JsApiNativeWXPayCgiTunnel", "onGYNetEnd errType :" + i17 + " errCode: " + i18 + " errMsg :" + str, new java.lang.Object[0]);
        yc1.u uVar = this.f542345c;
        int i19 = this.f542344b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f542343a;
        if (i17 != 0 || i18 != 0 || oVar.f152244b.f152233a == null) {
            rk0.c.b("MicroMsg.JsApiNativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi failed", new java.lang.Object[0]);
            uVar.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:server system error" : null;
            str3 = str2 != null ? str2 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1000);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i19, uVar.u(str3, jSONObject));
            return;
        }
        rk0.c.c("MicroMsg.JsApiNativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi success", new java.lang.Object[0]);
        og0.m mVar = (og0.m) i95.n0.c(og0.m.class);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        ((ng0.m) mVar).getClass();
        java.lang.String str5 = ((r45.hy5) fVar).f458089d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
            hashMap.put("respbuf", str5);
            uVar.getClass();
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            c0Var.a(i19, uVar.t("ok", hashMap));
            return;
        }
        uVar.getClass();
        str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str3 = str2 != null ? str2 : "";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i19, uVar.u(str3, jSONObject2));
    }
}
