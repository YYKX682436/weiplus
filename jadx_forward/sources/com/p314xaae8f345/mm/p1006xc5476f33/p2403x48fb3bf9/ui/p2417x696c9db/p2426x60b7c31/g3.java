package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class g3 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266661c;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f266661c = c1Var;
        this.f266659a = str;
        this.f266660b = y2Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        int parseColor;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266661c;
        c1Var.getClass();
        java.lang.String str = this.f266659a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, url is null");
            c1Var.i5(c1Var.f266509e, "openGameUrlWithExtraWebView:fail", null);
            return;
        }
        java.lang.String str2 = (java.lang.String) c1Var.f266509e.f422323a.get("statusBarColor");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            parseColor = 0;
        } else {
            try {
                parseColor = android.graphics.Color.parseColor(str2);
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView: " + e17.getMessage());
                c1Var.i5(c1Var.f266509e, "openGameUrlWithExtraWebView:fail_invalid_color", null);
                return;
            }
        }
        java.lang.String str3 = (java.lang.String) c1Var.f266509e.f422323a.get("statusBarStyle");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("customize_status_bar_color", parseColor);
        intent.putExtra("status_bar_style", str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, time: " + java.lang.System.currentTimeMillis());
        intent.putExtra("start_time", java.lang.System.currentTimeMillis());
        intent.putExtra("start_activity_time", java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.e(intent.getExtras(), "webview", ".ui.tools.WebViewUI", c1Var.f266531y, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h3(c1Var, intent));
        c1Var.i5(c1Var.f266509e, "openGameUrlWithExtraWebView:ok", null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView openInLiteApp success.");
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
        java.lang.String a17 = kh0.i.a(this.f266659a);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.f.a(linkedList, 4);
        }
        this.f266661c.i5(this.f266660b, "openGameUrlWithExtraWebView:ok", null);
    }
}
