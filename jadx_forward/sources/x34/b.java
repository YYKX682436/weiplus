package x34;

/* loaded from: classes4.dex */
public abstract class b {
    public static org.json.JSONObject a(android.content.Context context) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSysInfoInfoForWUA", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("build_version_release", android.os.Build.VERSION.RELEASE);
            jSONObject.put("build_model", wo.w0.m());
            jSONObject.put("build_version_codename", android.os.Build.VERSION.CODENAME);
            jSONObject.put("build_id", android.os.Build.ID);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenWidthBucket", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            try {
                i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getInteger(com.p314xaae8f345.mm.R.C30862x74b5813e.f569355p);
            } catch (java.lang.Exception unused) {
                i17 = 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenWidthBucket", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            jSONObject.put("sw_size", i17);
            jSONObject.put("build_manufacturer", android.os.Build.MANUFACTURER);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVersionReleaseOrCodename", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            try {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    str = android.os.Build.VERSION.RELEASE_OR_CODENAME;
                }
            } catch (java.lang.Exception unused2) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVersionReleaseOrCodename", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            jSONObject.put("build_release_or_codename", str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.UserAgentUtils", "getSysInfoInfoForWUA exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSysInfoInfoForWUA", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
        return jSONObject;
    }
}
