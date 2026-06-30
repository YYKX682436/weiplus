package z43;

/* loaded from: classes9.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) ? str : optString;
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        java.lang.String optString3 = jSONObject.optString("query");
        java.lang.String optString4 = jSONObject.optString("bizData");
        int optInt = jSONObject.optInt(ya.b.f77502x92235c1b);
        int optInt2 = jSONObject.optInt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4);
        java.lang.String optString5 = jSONObject.optString("gameShareId");
        java.lang.String optString6 = jSONObject.optString("gameShareData");
        java.lang.String optString7 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        int optInt3 = jSONObject.optInt("isVideo");
        int optInt4 = jSONObject.optInt("duration");
        java.lang.String optString8 = jSONObject.optString("thumbUrl");
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb c16074x60a84deb = new com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb(new com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138(str2, optString2, optString3, optString4, java.lang.Integer.valueOf(optInt), optInt2), optString5, optString6, optString7, optInt3, optInt4, jSONObject.optString("srcId"), jSONObject.optString("desc"));
        m63.g gVar = (m63.g) i95.n0.c(m63.g.class);
        android.content.Context c17 = c();
        ((l63.h) gVar).getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str3 = c16074x60a84deb.f223644g;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("Ksnsupload_title", str3);
        java.lang.String str4 = c16074x60a84deb.f223648n;
        intent.putExtra("KContentObjDesc", str4 != null ? str4 : "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString8)) {
            if (optString8.startsWith("http")) {
                intent.putExtra("Ksnsupload_imgurl", optString8);
            } else {
                intent.putExtra("KsnsUpload_imgPath", optString8);
            }
        }
        intent.putExtra("Ksnsupload_type", 34);
        java.lang.String str5 = c16074x60a84deb.f223647m;
        if (str5 != null && str5.length() > 0) {
            intent.putExtra("Ksnsupload_appid", str5);
        }
        intent.putExtra("ksnsis_gamesharecard", true);
        intent.putExtra("ksnsUpload_gameShareIsVideo", c16074x60a84deb.f223645h);
        intent.putExtra("ksnsUpload_gameShareData", c16074x60a84deb.f223643f);
        intent.putExtra("ksnsUpload_gameShareDuration", c16074x60a84deb.f223646i);
        intent.putExtra("ksnsUpload_gameShareId", c16074x60a84deb.f223642e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab138 = c16074x60a84deb.f223641d;
        intent.putExtra("KsnsUpload_LiteAppId", c16075xd72ab138.f223649d);
        intent.putExtra("KsnsUpload_LiteAppPath", c16075xd72ab138.f223650e);
        intent.putExtra("KsnsUpload_LiteAppQuery", c16075xd72ab138.f223651f);
        intent.putExtra("ksnsUpload_gameShareLiteAppBizData", c16075xd72ab138.f223652g);
        intent.putExtra("ksnsUpload_gameShareLiteAppPriority", c16075xd72ab138.f223654i);
        j45.l.j(c17, "sns", ".ui.SnsUploadUI", intent, null);
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
