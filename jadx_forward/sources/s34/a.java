package s34;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f484079a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484080b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484081c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f484083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f484084f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f484085g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f484086h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f484087i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f484088j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f484089k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f484090l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f484091m;

    /* renamed from: n, reason: collision with root package name */
    public long f484092n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f484093o;

    /* renamed from: p, reason: collision with root package name */
    public int f484094p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f484095q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f484096r;

    public static s34.a a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
        if (map != null) {
            try {
                if (map.containsKey(str)) {
                    s34.a aVar = new s34.a();
                    aVar.f484079a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str + ".appointmentId"));
                    java.lang.String str2 = (java.lang.String) map.get(str + ".btnTitleAfterAppointment");
                    java.lang.String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar.f484087i = str2;
                    java.lang.String str4 = (java.lang.String) map.get(str + ".nickname");
                    if (str4 == null) {
                        str4 = "";
                    }
                    aVar.f484080b = str4;
                    java.lang.String str5 = (java.lang.String) map.get(str + ".headImageUrl");
                    if (str5 == null) {
                        str5 = "";
                    }
                    aVar.f484081c = str5;
                    java.lang.String str6 = (java.lang.String) map.get(str + ".title");
                    if (str6 == null) {
                        str6 = "";
                    }
                    aVar.f484082d = str6;
                    java.lang.String str7 = (java.lang.String) map.get(str + ".content");
                    if (str7 == null) {
                        str7 = "";
                    }
                    aVar.f484083e = str7;
                    java.lang.String str8 = (java.lang.String) map.get(str + ".extraContent");
                    if (str8 == null) {
                        str8 = "";
                    }
                    aVar.f484084f = str8;
                    java.lang.String str9 = (java.lang.String) map.get(str + ".submitBtnTitle");
                    if (str9 == null) {
                        str9 = "";
                    }
                    aVar.f484085g = str9;
                    java.lang.String str10 = (java.lang.String) map.get(str + ".cancelBtnTitle");
                    if (str10 == null) {
                        str10 = "";
                    }
                    aVar.f484086h = str10;
                    java.lang.String str11 = (java.lang.String) map.get(str + ".submitSucToast");
                    if (str11 == null) {
                        str11 = "";
                    }
                    aVar.f484088j = str11;
                    java.lang.String str12 = (java.lang.String) map.get(str + ".submitFailedToast");
                    if (str12 == null) {
                        str12 = "";
                    }
                    aVar.f484089k = str12;
                    java.lang.String str13 = (java.lang.String) map.get(str + ".cancelSucToast");
                    if (str13 == null) {
                        str13 = "";
                    }
                    aVar.f484090l = str13;
                    java.lang.String str14 = (java.lang.String) map.get(str + ".cancelFailedToast");
                    if (str14 == null) {
                        str14 = "";
                    }
                    aVar.f484091m = str14;
                    aVar.f484092n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str + ".expiredTime"));
                    java.lang.String str15 = (java.lang.String) map.get(str + ".expiredBtnTitle");
                    if (str15 == null) {
                        str15 = "";
                    }
                    aVar.f484093o = str15;
                    aVar.f484094p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".requestPhoneNumber"), 0);
                    java.lang.String str16 = (java.lang.String) map.get(str + ".phoneNumberRequestName");
                    if (str16 == null) {
                        str16 = "";
                    }
                    aVar.f484095q = str16;
                    java.lang.String str17 = (java.lang.String) map.get(str + ".phoneNumberRequestIcon");
                    if (str17 != null) {
                        str3 = str17;
                    }
                    aVar.f484096r = str3;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
                    return aVar;
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAppointmentInfo", "parse the update info failed!!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
                return null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
        return null;
    }
}
