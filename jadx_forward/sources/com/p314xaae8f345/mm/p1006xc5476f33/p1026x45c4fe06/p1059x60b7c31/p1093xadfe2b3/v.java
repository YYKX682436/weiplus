package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34443x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f34444x24728b = "preloadLiteApp";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("invalid_data"));
            return;
        }
        try {
            if (!jSONObject.has("appId")) {
                lVar.a(i17, o("invalid_appId"));
                return;
            }
            java.lang.String string = jSONObject.getString("appId");
            java.lang.String string2 = jSONObject.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f) ? jSONObject.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f) : "";
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jSONObject.optBoolean("onlyUpdate", false));
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(jSONObject.optBoolean("onlyDownload", false));
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(jSONObject.optBoolean("onlyPreLoadBaseLib", false));
            if (!valueOf.booleanValue() && !valueOf2.booleanValue()) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(lVar.getF229340d(), string, string2, valueOf3.booleanValue() ? "updateBaseLibPath" : f34444x24728b);
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(string, null);
            lVar.a(i17, o("ok"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiPreloadLiteApp", e17, "", new java.lang.Object[0]);
            lVar.a(i17, o("fail"));
        }
    }
}
