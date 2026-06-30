package td1;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c f499127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f499128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ td1.f f499129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c c12222x1751690c, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, td1.f fVar) {
        super(1);
        this.f499127d = c12222x1751690c;
        this.f499128e = rVar;
        this.f499129f = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e3 e3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().f157968f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c c12222x1751690c = this.f499127d;
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4> a17 = e3Var.a(longValue, c12222x1751690c.f164441d);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetRecentUsageList", "lastUpdateTime=" + longValue + "  requestId=" + c12222x1751690c.f164443f + " count=" + c12222x1751690c.f164441d);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 : a17) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11712x63ef1ef4);
            this.f499129f.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("userName", c11712x63ef1ef4.f157894d);
            jSONObject.put("appName", c11712x63ef1ef4.f157889x);
            jSONObject.put("appId", c11712x63ef1ef4.f157895e);
            jSONObject.put("shortNickname", c11712x63ef1ef4.f157900m);
            jSONObject.put("appIcon", c11712x63ef1ef4.f157890y);
            jSONObject.put("appServiceType", c11712x63ef1ef4.f157891z);
            jSONObject.put("appVersion", c11712x63ef1ef4.f157897g);
            jSONObject.put("runningFlag", c11712x63ef1ef4.f157903p);
            jSONObject.put("cannotAddStarWxaUtil", c11712x63ef1ef4.f157904q);
            jSONObject.put("starApp", c11712x63ef1ef4.B);
            jSONObject.put("debugType", c11712x63ef1ef4.A);
            jSONObject.put(dm.i4.f66874x4c6b1f55, c11712x63ef1ef4.C);
            jSONObject.put("runInThirdPartyAppRecently", c11712x63ef1ef4.f157905r);
            jSONObject.put("thirdPartyAppUsingDesc", c11712x63ef1ef4.f157906s);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1) {
                jSONObject.put("showRelievedBuyFlag", c11712x63ef1ef4.D);
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_show_official_flag, 0) == 1) {
                jSONObject.put("showOfficialFlag", c11712x63ef1ef4.G);
            }
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        this.f499128e.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a(jSONArray2, 0, ""));
        return jz5.f0.f384359a;
    }
}
