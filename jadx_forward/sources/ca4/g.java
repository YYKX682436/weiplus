package ca4;

/* loaded from: classes4.dex */
public class g extends a84.s0 {
    public final int A;
    public final int B;
    public java.lang.String C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f121431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121432b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121433c;

    /* renamed from: d, reason: collision with root package name */
    public int f121434d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f121435e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121436f;

    /* renamed from: g, reason: collision with root package name */
    public final long f121437g;

    /* renamed from: h, reason: collision with root package name */
    public final int f121438h;

    /* renamed from: i, reason: collision with root package name */
    public final int f121439i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f121440j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f121441k;

    /* renamed from: l, reason: collision with root package name */
    public final int f121442l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f121443m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f121444n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f121445o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f121446p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f121447q;

    /* renamed from: r, reason: collision with root package name */
    public final int f121448r;

    /* renamed from: s, reason: collision with root package name */
    public final int f121449s;

    /* renamed from: t, reason: collision with root package name */
    public final int f121450t;

    /* renamed from: u, reason: collision with root package name */
    public final int f121451u;

    /* renamed from: v, reason: collision with root package name */
    public final int f121452v;

    /* renamed from: w, reason: collision with root package name */
    public final int f121453w;

    /* renamed from: x, reason: collision with root package name */
    public final int f121454x;

    /* renamed from: y, reason: collision with root package name */
    public final int f121455y;

    /* renamed from: z, reason: collision with root package name */
    public final int f121456z;

    public g(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, ca4.e eVar) {
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        this.f121431a = str7;
        this.f121432b = ca4.z0.E();
        this.f121433c = 2;
        this.f121434d = 8;
        android.content.pm.PackageInfo a17 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str7);
        this.f121435e = a17 != null ? a17.versionName : "";
        this.f121436f = 1;
        this.f121437g = java.lang.System.currentTimeMillis();
        this.f121438h = i17;
        this.f121439i = i18;
        this.f121440j = str;
        this.f121441k = str2;
        this.f121442l = i19;
        this.f121443m = str3;
        this.f121445o = str4;
        this.f121446p = str5;
        this.f121447q = str6;
        this.f121448r = i27;
        this.f121449s = i28;
        this.f121450t = i29;
        this.f121451u = i37;
        this.f121452v = i38;
        this.f121453w = i39;
        this.f121454x = i47;
        this.f121455y = i48;
        this.f121456z = i49;
        this.A = i57;
        this.B = i58;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            if (!android.text.TextUtils.isEmpty(this.F)) {
                jSONObject.putOpt("jsbundle_version", this.F);
            }
            jSONObject.putOpt("pkg", this.f121431a);
            jSONObject.putOpt("ct", java.lang.Integer.valueOf(this.f121432b));
            jSONObject.putOpt("os", java.lang.Integer.valueOf(this.f121433c));
            jSONObject.putOpt("sdk_st", java.lang.Integer.valueOf(this.f121434d));
            jSONObject.putOpt("av", this.f121435e);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            jSONObject.putOpt("canvasId", this.f121441k);
            jSONObject.putOpt("enterScene", java.lang.Integer.valueOf(this.f121442l));
            jSONObject.putOpt("adExtInfo", this.f121443m);
            jSONObject.putOpt("reportParams", this.f121444n);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    public final void c(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonArray", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, java.lang.Integer.valueOf(this.f121436f));
            jSONObject.putOpt("ts", java.lang.Long.valueOf(this.f121437g));
            jSONObject.putOpt("ei", java.lang.Integer.valueOf(this.f121438h));
            jSONObject.putOpt("vl", java.lang.Integer.valueOf(this.f121439i));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            b(jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.putOpt("aid", this.f121445o);
            jSONObject3.putOpt("traceid", this.f121446p);
            jSONObject3.putOpt("pid", this.f121447q);
            jSONObject3.putOpt("cost_time", java.lang.Integer.valueOf(this.f121448r));
            jSONObject3.putOpt("download_scene", java.lang.Integer.valueOf(this.f121449s));
            jSONObject3.putOpt("actor", java.lang.Integer.valueOf(this.f121450t));
            jSONObject3.putOpt("act_code", java.lang.Integer.valueOf(this.f121451u));
            jSONObject3.putOpt("autodownload", java.lang.Integer.valueOf(this.f121452v));
            jSONObject3.putOpt("dialog_type", java.lang.Integer.valueOf(this.f121453w));
            jSONObject3.putOpt("deeplink_scene", java.lang.Integer.valueOf(this.f121454x));
            jSONObject3.putOpt("deeplink_type", java.lang.Integer.valueOf(this.f121455y));
            jSONObject3.putOpt("wv_progress", java.lang.Integer.valueOf(this.f121456z));
            jSONObject3.putOpt("lp_type", java.lang.Integer.valueOf(this.A));
            jSONObject3.putOpt("click_req_type", java.lang.Integer.valueOf(this.B));
            jSONObject3.putOpt("page_exit_action", this.C);
            jSONObject3.putOpt("origin_error_code", java.lang.Integer.valueOf(this.D));
            jSONObject3.putOpt("uxinfo", this.f121440j);
            jSONObject3.putOpt("vangogh_id", this.E);
            jSONObject.putOpt("ext", jSONObject2);
            jSONObject.putOpt("biz", jSONObject3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
            jSONObject = null;
        }
        if (jSONObject != null) {
            jSONArray.put(jSONObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonArray", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        return "sns_ad_conversion_online_report";
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            try {
                jSONObject = new org.json.JSONObject();
                a(jSONObject);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                jSONObject = null;
            }
            if (jSONObject != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                c(jSONArray);
                jSONObject.putOpt("events", jSONArray);
                java.lang.String jSONObject2 = jSONObject.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
                return jSONObject2;
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        return "";
    }
}
