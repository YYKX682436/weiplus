package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public class y extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1190;
    private static final java.lang.String NAME = "shareSpecificWxapp";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
        if (optString == null) {
            return;
        }
        boolean has = jSONObject.has("commentScore");
        int optInt = jSONObject.optInt("commentScore", -1);
        int optInt2 = jSONObject.optInt("certificationImageType", 0);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_USERNAME, optString);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.jsapi.profile.w.class, new com.tencent.mm.plugin.appbrand.jsapi.profile.s(this, optString, has, optInt, optInt2, e9Var, i17));
    }
}
