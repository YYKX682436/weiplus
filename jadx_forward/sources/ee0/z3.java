package ee0;

@j95.b
/* loaded from: classes4.dex */
public class z3 extends i95.w implements fe0.y3 {
    public void Ai(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportOpenCanvas", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        l64.a.d(str, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportOpenCanvas", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
    }

    public java.lang.String wi(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenCanvasAdExtraInfo", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        java.lang.String str3 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("appId", str);
            jSONObject.put("canvasId", j17 == 0 ? "" : java.lang.String.valueOf(j17));
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("uxInfo", str2);
            str3 = jSONObject.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenCanvasAdExtraInfo", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        return str3;
    }
}
