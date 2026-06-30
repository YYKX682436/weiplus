package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class m8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34449x366c91de = 925;

    /* renamed from: NAME */
    public static final java.lang.String f34450x24728b = "requestOfflineUserBindQuery";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOfflineUserBindQuery", "invoke JsApiOfflineUserBindQuery! data is ：%s", jSONObject.toString());
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOfflineUserBindQuery", "fail:component is null");
        } else {
            if (yVar.getF229340d() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = yVar.t3().u0();
                java.lang.String str = u07.f158811d;
                java.lang.String str2 = u07.f158812e;
                java.lang.String m52170xad58292c = yVar.t3().x0().m52170xad58292c();
                java.lang.String optString = jSONObject.optString("nonceStr");
                java.lang.String optString2 = jSONObject.optString("timeStamp");
                java.lang.String optString3 = jSONObject.optString("paySign");
                java.lang.String optString4 = jSONObject.optString("signType");
                java.lang.String optString5 = jSONObject.optString("package");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", str);
                bundle.putString("appName", str2);
                bundle.putString("appPath", m52170xad58292c);
                bundle.putString("nonceStr", optString);
                bundle.putString("timeStamp", optString2);
                bundle.putString("paySign", optString3);
                bundle.putString("signType", optString4);
                bundle.putString("packageInfo", optString5);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l8.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j8(this, yVar, i17));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOfflineUserBindQuery", "fail:context is null");
            yVar.a(i17, o("fail:context is null"));
        }
    }
}
