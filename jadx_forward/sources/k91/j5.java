package k91;

/* loaded from: classes7.dex */
public final class j5 {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f387161c;

    /* renamed from: d, reason: collision with root package name */
    public int f387162d;

    /* renamed from: e, reason: collision with root package name */
    public int f387163e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f387164f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f387165g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f387166h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f387167i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f387168j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f387169k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f387170l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387171m;

    /* renamed from: n, reason: collision with root package name */
    public int f387172n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387173o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387174p;

    /* renamed from: u, reason: collision with root package name */
    public int f387179u;

    /* renamed from: v, reason: collision with root package name */
    public int f387180v;

    /* renamed from: w, reason: collision with root package name */
    public int f387181w;

    /* renamed from: y, reason: collision with root package name */
    public r45.ie7 f387183y;

    /* renamed from: z, reason: collision with root package name */
    public int f387184z;

    /* renamed from: a, reason: collision with root package name */
    public long f387159a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f387160b = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f387175q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f387176r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f387177s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f387178t = 0;

    /* renamed from: x, reason: collision with root package name */
    public int[] f387182x = null;
    public long A = 0;

    public static k91.j5 a(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json is EMPTY");
            return null;
        }
        android.os.SystemClock.elapsedRealtime();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            k91.j5 j5Var = new k91.j5();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("RunningFlagInfo");
            if (optJSONObject != null) {
                j5Var.f387159a = optJSONObject.optLong("RunningFlag");
                optJSONObject.optString("AppOpenForbiddenUrl");
                j5Var.f387160b = optJSONObject.optLong("CanNotStarWxaBeforeTime", 0L);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("Network");
            if (optJSONObject2 != null) {
                j5Var.f387164f = k91.a6.a(optJSONObject2.optJSONArray("RequestDomain"));
                j5Var.f387165g = k91.a6.a(optJSONObject2.optJSONArray("WsRequestDomain"));
                j5Var.f387166h = k91.a6.a(optJSONObject2.optJSONArray("UploadDomain"));
                j5Var.f387167i = k91.a6.a(optJSONObject2.optJSONArray("DownloadDomain"));
                j5Var.f387168j = k91.a6.a(optJSONObject2.optJSONArray("UDPDomain"));
                j5Var.f387169k = k91.a6.a(optJSONObject2.optJSONArray("TCPDomain"));
                j5Var.f387170l = k91.a6.a(optJSONObject2.optJSONArray("PrefetchDNSDomain"));
            }
            j5Var.f387161c = jSONObject.optString("Appid");
            j5Var.f387163e = jSONObject.optInt("WechatPluginApp", 0);
            j5Var.f387162d = jSONObject.optInt("AppServiceType", 0);
            j5Var.f387171m = jSONObject.optString("fromBusinessUsername");
            j5Var.f387172n = jSONObject.optInt("OriginalFlag", 0);
            j5Var.f387173o = jSONObject.optString("OriginalRedirectUrl");
            j5Var.f387174p = jSONObject.optString("game_icon_flag_list");
            j5Var.f387175q = jSONObject.optInt("ShowRelievedBuyFlag", 0);
            j5Var.f387176r = jSONObject.optInt("ShowFlagshipFlag", 0);
            j5Var.f387177s = jSONObject.optInt("ShowFinancialLicenseFlag", 0);
            j5Var.f387178t = jSONObject.optInt("AgeAppropriateLevel", 0);
            j5Var.f387179u = jSONObject.optInt("SystemAuthBizScene", 0);
            j5Var.f387180v = jSONObject.optInt("SystemAuthFrequencyLimitFlag", 0);
            j5Var.f387181w = jSONObject.optInt("LaunchFallbackMinVersion", 0);
            j5Var.f387182x = new int[0];
            if (jSONObject.has("LaunchFallbackMinVersion_BlackScenes") && (optJSONArray = jSONObject.optJSONArray("LaunchFallbackMinVersion_BlackScenes")) != null) {
                j5Var.f387182x = new int[optJSONArray.length()];
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    j5Var.f387182x[i17] = optJSONArray.optInt(i17);
                }
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("MigrateInfo");
            if (optJSONObject3 != null) {
                r45.ie7 ie7Var = new r45.ie7();
                j5Var.f387183y = ie7Var;
                ie7Var.f458511d = optJSONObject3.optString("target_appid");
            }
            j5Var.f387184z = jSONObject.optInt("BatchPreFetchBusiFlag", 0);
            j5Var.A = jSONObject.optLong("depend_lib_bit_flag", 0L);
            return j5Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json(%s) parse failed ex = %s", str, e17);
            return null;
        }
    }

    public boolean b() {
        return this.f387162d == 4;
    }

    public boolean c() {
        return this.f387163e > 0 || this.f387162d == 7;
    }
}
