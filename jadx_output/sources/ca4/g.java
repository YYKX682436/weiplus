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
    public final java.lang.String f39898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39900c;

    /* renamed from: d, reason: collision with root package name */
    public int f39901d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f39902e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39903f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39904g;

    /* renamed from: h, reason: collision with root package name */
    public final int f39905h;

    /* renamed from: i, reason: collision with root package name */
    public final int f39906i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f39907j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f39908k;

    /* renamed from: l, reason: collision with root package name */
    public final int f39909l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f39910m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f39911n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f39912o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f39913p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f39914q;

    /* renamed from: r, reason: collision with root package name */
    public final int f39915r;

    /* renamed from: s, reason: collision with root package name */
    public final int f39916s;

    /* renamed from: t, reason: collision with root package name */
    public final int f39917t;

    /* renamed from: u, reason: collision with root package name */
    public final int f39918u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39919v;

    /* renamed from: w, reason: collision with root package name */
    public final int f39920w;

    /* renamed from: x, reason: collision with root package name */
    public final int f39921x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39922y;

    /* renamed from: z, reason: collision with root package name */
    public final int f39923z;

    public g(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, ca4.e eVar) {
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.x2.f193072b;
        this.f39898a = str7;
        this.f39899b = ca4.z0.E();
        this.f39900c = 2;
        this.f39901d = 8;
        android.content.pm.PackageInfo a17 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, str7);
        this.f39902e = a17 != null ? a17.versionName : "";
        this.f39903f = 1;
        this.f39904g = java.lang.System.currentTimeMillis();
        this.f39905h = i17;
        this.f39906i = i18;
        this.f39907j = str;
        this.f39908k = str2;
        this.f39909l = i19;
        this.f39910m = str3;
        this.f39912o = str4;
        this.f39913p = str5;
        this.f39914q = str6;
        this.f39915r = i27;
        this.f39916s = i28;
        this.f39917t = i29;
        this.f39918u = i37;
        this.f39919v = i38;
        this.f39920w = i39;
        this.f39921x = i47;
        this.f39922y = i48;
        this.f39923z = i49;
        this.A = i57;
        this.B = i58;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            if (!android.text.TextUtils.isEmpty(this.F)) {
                jSONObject.putOpt("jsbundle_version", this.F);
            }
            jSONObject.putOpt("pkg", this.f39898a);
            jSONObject.putOpt("ct", java.lang.Integer.valueOf(this.f39899b));
            jSONObject.putOpt("os", java.lang.Integer.valueOf(this.f39900c));
            jSONObject.putOpt("sdk_st", java.lang.Integer.valueOf(this.f39901d));
            jSONObject.putOpt("av", this.f39902e);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            jSONObject.putOpt("canvasId", this.f39908k);
            jSONObject.putOpt("enterScene", java.lang.Integer.valueOf(this.f39909l));
            jSONObject.putOpt("adExtInfo", this.f39910m);
            jSONObject.putOpt("reportParams", this.f39911n);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    public final void c(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, java.lang.Integer.valueOf(this.f39903f));
            jSONObject.putOpt("ts", java.lang.Long.valueOf(this.f39904g));
            jSONObject.putOpt("ei", java.lang.Integer.valueOf(this.f39905h));
            jSONObject.putOpt("vl", java.lang.Integer.valueOf(this.f39906i));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            b(jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.putOpt("aid", this.f39912o);
            jSONObject3.putOpt("traceid", this.f39913p);
            jSONObject3.putOpt("pid", this.f39914q);
            jSONObject3.putOpt("cost_time", java.lang.Integer.valueOf(this.f39915r));
            jSONObject3.putOpt("download_scene", java.lang.Integer.valueOf(this.f39916s));
            jSONObject3.putOpt("actor", java.lang.Integer.valueOf(this.f39917t));
            jSONObject3.putOpt("act_code", java.lang.Integer.valueOf(this.f39918u));
            jSONObject3.putOpt("autodownload", java.lang.Integer.valueOf(this.f39919v));
            jSONObject3.putOpt("dialog_type", java.lang.Integer.valueOf(this.f39920w));
            jSONObject3.putOpt("deeplink_scene", java.lang.Integer.valueOf(this.f39921x));
            jSONObject3.putOpt("deeplink_type", java.lang.Integer.valueOf(this.f39922y));
            jSONObject3.putOpt("wv_progress", java.lang.Integer.valueOf(this.f39923z));
            jSONObject3.putOpt("lp_type", java.lang.Integer.valueOf(this.A));
            jSONObject3.putOpt("click_req_type", java.lang.Integer.valueOf(this.B));
            jSONObject3.putOpt("page_exit_action", this.C);
            jSONObject3.putOpt("origin_error_code", java.lang.Integer.valueOf(this.D));
            jSONObject3.putOpt("uxinfo", this.f39907j);
            jSONObject3.putOpt("vangogh_id", this.E);
            jSONObject.putOpt("ext", jSONObject2);
            jSONObject.putOpt("biz", jSONObject3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
            jSONObject = null;
        }
        if (jSONObject != null) {
            jSONArray.put(jSONObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        return "sns_ad_conversion_online_report";
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            try {
                jSONObject = new org.json.JSONObject();
                a(jSONObject);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            } catch (java.lang.Throwable unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                jSONObject = null;
            }
            if (jSONObject != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                c(jSONArray);
                jSONObject.putOpt("events", jSONArray);
                java.lang.String jSONObject2 = jSONObject.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
                return jSONObject2;
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        return "";
    }
}
