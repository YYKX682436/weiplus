package k54;

/* loaded from: classes8.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f385991e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f385992f;

    public v(zg0.q2 q2Var, android.content.Context context) {
        this.f385991e = new java.lang.ref.WeakReference(context);
        this.f385992f = new java.lang.ref.WeakReference(q2Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String Ni() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommitUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            zg0.q2 q2Var = (zg0.q2) this.f385992f.get();
            if (q2Var == null || (str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).E) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommitUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return str;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "callback: getCommitUrl failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommitUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        zg0.q2 q2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHandleEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            q2Var = (zg0.q2) this.f385992f.get();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "In onHandleEnd method, it happens something unwanted!");
        }
        if (q2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHandleEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return false;
        }
        nw4.n g07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).g0();
        ((ku5.t0) ku5.t0.f394148d).B(new k54.u(g07, str, str2, bundle, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHandleEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: callback */
    public boolean mo70207xf5bc2045(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            d(i17, bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "In callback method, it happens something unwanted!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        }
    }

    public final boolean d(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        zg0.q2 q2Var = (zg0.q2) this.f385992f.get();
        if (q2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var;
        nw4.n g07 = r0Var.g0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = r0Var.R;
        if (i17 == 1006) {
            ((ku5.t0) ku5.t0.f394148d).B(new k54.t(bundle, wVar, g07));
        }
        ((yg0.a) ((zg0.r2) i95.n0.c(zg0.r2.class))).getClass();
        nw4.n g08 = r0Var.g0();
        boolean z17 = false;
        if (i17 == 1013) {
            if (g08 != null) {
                try {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle);
                    java.lang.String string = bundle.getString("__appId");
                    java.lang.String str = "";
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String string2 = bundle.getString("__url");
                    if (string2 != null) {
                        str = string2;
                    }
                    if (bundle.containsKey("__webComptList")) {
                        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("__webComptList");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringArrayList);
                        java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            java.lang.String next = it.next();
                            r45.d24 d24Var = new r45.d24();
                            d24Var.mo11468x92b714fd(bundle.getByteArray(next));
                            linkedList.add(d24Var);
                        }
                    }
                    if (g08.y() != null) {
                        g08.y().b(string, str, linkedList);
                    }
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CommWebViewWithControllerService", e17, "parse webCompt", new java.lang.Object[0]);
                }
            }
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebViewStubCallback", "onCallback, webViewStubCallback process.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            zg0.q2 q2Var = (zg0.q2) this.f385992f.get();
            if (q2Var == null || (str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).Z()) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return str;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "callback: getCurrentUrl failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeAsResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            android.content.Context context = (android.content.Context) this.f385991e.get();
            if (i17 == 101 && context != null && bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
                android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "open_ui_with_webview_ui_plugin_name");
                java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "open_ui_with_webview_ui_plugin_entry");
                android.content.Intent intent = new android.content.Intent();
                if (bundle3 == null) {
                    bundle3 = new android.os.Bundle();
                }
                j45.l.j(context, k17, k18, intent.putExtras(bundle3), null);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "In invokeAsResult method, it happens something unwanted!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeAsResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        return bundle2;
    }
}
