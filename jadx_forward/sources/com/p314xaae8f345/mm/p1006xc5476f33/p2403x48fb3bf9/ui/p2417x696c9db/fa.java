package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fa f265713a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fa();

    /* renamed from: b, reason: collision with root package name */
    public static int f265714b;

    public final void a(android.content.Intent intent, java.lang.String url, boolean z17) {
        android.os.Bundle bundle;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (intent == null || (bundle = (android.os.Bundle) intent.getParcelableExtra("ad_report_bundle")) == null || !bundle.getBoolean("ad_need_report", false)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewThirdAdReporter", "adReportArgs is not null and isADReport is true, ad h5");
        java.lang.String string = bundle.getString("ad_report_ux_info");
        int i17 = bundle.getInt("ad_report_scene", 0);
        int i18 = bundle.getInt("ad_report_source", 0);
        java.lang.String string2 = android.text.TextUtils.isEmpty(bundle.getString("ad_report_sns_id")) ? bundle.getString("ad_report_sns_id") : "";
        try {
            java.lang.String b17 = fp.s0.b(url, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "encode(...)");
            str = b17;
        } catch (java.io.UnsupportedEncodingException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewThirdAdReporter", "url encode error url = %s", url);
            str = "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16972, string2, java.lang.Integer.valueOf(i17), string, java.lang.Integer.valueOf(i18), "", str2, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(f265714b), java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewThirdAdReporter", "%s,%s,%s,%s,%s,%s,%s,%s,%s", string2, java.lang.Integer.valueOf(i17), string, java.lang.Integer.valueOf(i18), "", str2, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(f265714b), java.lang.Long.valueOf(currentTimeMillis));
    }
}
