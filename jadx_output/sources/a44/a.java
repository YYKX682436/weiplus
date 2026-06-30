package a44;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1226b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f1227c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f1228d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f1229e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f1230f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f1231g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f1232h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1233i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f1234j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f1235k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f1236l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f1237m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f1238n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f1239o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f1240p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f1241q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f1242r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f1243s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f1244t;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Integer num, java.lang.String str4) {
        this.f1225a = str;
        this.f1226b = str2;
        this.f1227c = str3;
        this.f1228d = bool;
        this.f1229e = num;
        this.f1230f = str4;
    }

    public static final a44.a q(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        a44.a aVar = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".openSdkAppIdAndroid"));
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".packageName"));
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".channelId"));
            java.lang.String str7 = str6 == null ? "" : str6;
            java.lang.String str8 = (java.lang.String) map.get(str.concat(".useGameDownloadWidget"));
            int i17 = 1;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf((str8 == null || (h18 = r26.h0.h(str8)) == null || h18.intValue() != 1) ? false : true);
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".platform"));
            if (str9 != null && (h17 = r26.h0.h(str9)) != null) {
                i17 = h17.intValue();
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".warningAndroid"));
            if (str10 == null) {
                str10 = "";
            }
            aVar = new a44.a(str3, str5, str7, valueOf, valueOf2, str10);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return aVar;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAgreementUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1235k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAgreementUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppDescUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1233i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppDescUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1241q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1240p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppVersion", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1231g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppVersion", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAuthorName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1238n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAuthorName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAuthorityUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1234j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAuthorityUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDeveloper", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1232h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDeveloper", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1243s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMd5", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1242r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMd5", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenSdkAppIdAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenSdkAppIdAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return this.f1225a;
    }

    public final java.lang.String l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPackageName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPackageName", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return this.f1226b;
    }

    public final java.lang.String m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecordNumber", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1236l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecordNumber", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRedirectUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1244t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRedirectUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.String o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSuitableAge", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.String str = this.f1237m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuitableAge", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return str;
    }

    public final java.lang.Boolean p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.Boolean bool = this.f1228d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        return bool;
    }
}
