package fc1;

/* loaded from: classes4.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69734x366c91de = 867;

    /* renamed from: NAME */
    public static final java.lang.String f69735x24728b = "getDeviceInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        uh1.a aVar;
        java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("waidPkg");
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            str = me4.c.d(optString);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppWaid(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetDeviceInfo", "waidPkg=" + optString);
        } else {
            str = "";
        }
        java.lang.String Ai = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai();
        java.lang.String str2 = (lVar == null || (aVar = (uh1.a) lVar.b(uh1.a.class)) == null) ? null : aVar.B;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetDeviceInfo", "getDeviceInfo, oaid:" + k96 + ", imei:, waid:" + str, "ua:" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1896, 20);
        java.util.Map k17 = kz5.c1.k(new jz5.l("oaid", k96), new jz5.l("imei", ""), new jz5.l("waid", str), new jz5.l("devIdInfo", Ai), new jz5.l("ua", str2));
        if (lVar != null) {
            lVar.a(i17, p("ok", k17));
        }
    }
}
