package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class t7 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t7 f268429i = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t7();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f268430a;

    /* renamed from: b, reason: collision with root package name */
    public int f268431b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f268432c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f268433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f268434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f268435f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f268436g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 f268437h = null;

    public void a() {
        java.lang.String str = this.f268430a;
        this.f268436g = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        c(4, "", 0);
        this.f268430a = null;
    }

    public java.lang.String b() {
        return this.f268430a;
    }

    public final void c(int i17, java.lang.String str, int i18) {
        m21.x xVar = new m21.x();
        xVar.a("20adInfo", this.f268430a + ",");
        xVar.a("21optype", i17 + ",");
        xVar.a("22sessionId", this.f268432c + ",");
        xVar.a("23currURL", this.f268435f + ",");
        xVar.a("24referURL", str + ",");
        xVar.a("25errCode", i18 + ",");
        xVar.a("26networkType", this.f268431b + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("27timeStamp", sb6.toString());
        xVar.a("28ssid", this.f268433d + ",");
        xVar.a("29bssid", this.f268434e + ",");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportUtil", "report logbuffer adPageOp(13791): optype:%d, sessionId:%s, currUrl:%s, referUrl:%s, errCode:%d, networkType:%d", java.lang.Integer.valueOf(i17), this.f268432c, this.f268435f, str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f268431b));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13791, xVar);
        if (this.f268437h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewReportUtil", "report invoker null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("ad_report_data_str", xVar.m146697x9616526c());
        try {
            this.f268437h.F4(1295, bundle);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewReportUtil", "report: exp:%s", e17);
        }
    }

    public void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportUtil", "setting traceid " + str + ",usename " + str2);
        this.f268430a = str;
        this.f268431b = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f268432c = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(sb6.toString());
        this.f268433d = "";
        this.f268434e = "";
        this.f268436g = false;
    }
}
