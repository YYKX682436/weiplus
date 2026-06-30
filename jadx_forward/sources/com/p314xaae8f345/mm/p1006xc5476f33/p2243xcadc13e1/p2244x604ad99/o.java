package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    public long f253667c;

    /* renamed from: i, reason: collision with root package name */
    public long f253673i;

    /* renamed from: j, reason: collision with root package name */
    public long f253674j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f253665a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f253666b = "";

    /* renamed from: d, reason: collision with root package name */
    public long f253668d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f253669e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f253670f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f253671g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f253672h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f253675k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f253676l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f253677m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f253678n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f253679o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f253680p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f253681q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f253682r = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f253683s = "";

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o a() {
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(327942, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JdMsgContent", " create xml : " + str);
        oVar.b(str);
        return oVar;
    }

    public void b(java.lang.String str) {
        this.f253665a = "";
        this.f253666b = "";
        this.f253668d = 0L;
        this.f253671g = "";
        this.f253669e = false;
        this.f253670f = false;
        this.f253676l = "";
        this.f253677m = "";
        this.f253678n = "";
        this.f253675k = "";
        this.f253679o = "";
        this.f253683s = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JdMsgContent", "feed xml %s", str);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.biztype");
        if (str2 == null) {
            str2 = "";
        }
        this.f253665a = str2;
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.alert");
        if (str3 == null) {
            str3 = "";
        }
        this.f253675k = str3;
        java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.activityid");
        if (str4 == null) {
            str4 = "";
        }
        this.f253666b = str4;
        this.f253667c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) d17.get(".sysmsg.starttime"));
        this.f253668d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) d17.get(".sysmsg.expiretime"));
        java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.content.jumpurl");
        if (str5 == null) {
            str5 = "";
        }
        this.f253679o = str5;
        java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.content.jumpweapp.username");
        if (str6 == null) {
            str6 = "";
        }
        this.f253680p = str6;
        java.lang.String str7 = (java.lang.String) d17.get(".sysmsg.content.jumpweapp.path");
        if (str7 == null) {
            str7 = "";
        }
        this.f253681q = str7;
        this.f253682r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".sysmsg.content.jumpweapp.version"), 0);
        this.f253673i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) d17.get(".sysmsg.content.urlstarttime"));
        this.f253674j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) d17.get(".sysmsg.content.urlexpiretime"));
        java.lang.String str8 = (java.lang.String) d17.get(".sysmsg.content.jdcelltitle");
        if (str8 == null) {
            str8 = "";
        }
        this.f253671g = str8;
        java.lang.String str9 = (java.lang.String) d17.get(".sysmsg.content.jdcellicon");
        if (str9 == null) {
            str9 = "";
        }
        this.f253672h = str9;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) d17.get(".sysmsg.content.titlestarttime"));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) d17.get(".sysmsg.content.titleexpiretime"));
        this.f253669e = "1".equals(d17.get(".sysmsg.content.findshowreddot"));
        this.f253670f = "1".equals(d17.get(".sysmsg.content.jdcellshowred"));
        java.lang.String str10 = (java.lang.String) d17.get(".sysmsg.content.alertviewtitle");
        if (str10 == null) {
            str10 = "";
        }
        this.f253676l = str10;
        java.lang.String str11 = (java.lang.String) d17.get(".sysmsg.content.alertviewconfirm");
        if (str11 == null) {
            str11 = "";
        }
        this.f253677m = str11;
        java.lang.String str12 = (java.lang.String) d17.get(".sysmsg.content.alertviewcancel");
        this.f253678n = str12 != null ? str12 : "";
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o oVar) {
        if (oVar == null) {
            return true;
        }
        java.lang.String str = this.f253666b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = oVar.f253666b;
        return !str.equals(str2 != null ? str2 : "");
    }

    public boolean d() {
        long j17 = this.f253668d;
        return j17 != 0 && j17 < java.lang.System.currentTimeMillis() / 1000;
    }

    public boolean e() {
        return this.f253667c < java.lang.System.currentTimeMillis() / 1000;
    }
}
