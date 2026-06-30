package k54;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f385953a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f0 f385954b;

    /* renamed from: c, reason: collision with root package name */
    public final zg0.q2 f385955c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f385956d;

    /* renamed from: e, reason: collision with root package name */
    public final zg0.o3 f385957e;

    public f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w permission, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f0 f0Var, zg0.q2 q2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        this.f385953a = permission;
        this.f385954b = f0Var;
        this.f385955c = q2Var;
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        this.f385957e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0();
        this.f385956d = new java.lang.ref.WeakReference(context);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        try {
            context = (android.content.Context) this.f385956d.get();
        } catch (java.lang.Throwable unused) {
            ot5.g.d("SnsAd.WebViewChromeClient", "the application has no geo permission.");
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            boolean z17 = (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            if (z17 && callback != null) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
                    db5.e1.K(context, false, ((android.app.Activity) context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575197l64, str), ((android.app.Activity) context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575198l65), ((android.app.Activity) context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), ((android.app.Activity) context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new k54.c(callback, str), new k54.d(callback, str));
                } else {
                    ot5.g.d("SnsAd.WebViewChromeClient", "the application has no geo permission.");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                return;
            }
        }
        ot5.g.d("SnsAd.WebViewChromeClient", "the activity is finished, or callback is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPermissionRequest", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            zg0.q2 q2Var = this.f385955c;
            jz5.f0 f0Var = null;
            if (q2Var != null) {
                android.app.Activity a17 = q75.a.a((android.content.Context) this.f385956d.get());
                if (a17 == null) {
                    ot5.g.a("SnsAd.WebViewChromeClient", "onPermissionRequest NULL activity");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPermissionRequest", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                    return;
                }
                java.lang.String Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).Z();
                ot5.g.c("SnsAd.WebViewChromeClient", "onPermissionRequest, url is " + Z);
                zg0.o3 o3Var = this.f385957e;
                if (o3Var != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0) o3Var).h(permissionRequest, a17, Z);
                    f0Var = jz5.f0.f384359a;
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.WebViewChromeClient", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPermissionRequest", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, android.webkit.ValueCallback valueCallback, com.p314xaae8f345.p3210x3857dc.r0 r0Var) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        try {
            context = (android.content.Context) this.f385956d.get();
            f0Var = this.f385954b;
        } catch (java.lang.Throwable unused) {
            ot5.g.a("SnsAd.WebViewChromeClient", "onShowFileChooser has something wrong");
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            boolean z17 = (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            if (z17 && r0Var != null && f0Var != null) {
                if (r0Var.c() == 0 || r0Var.c() == 1) {
                    java.lang.String[] b17 = r0Var.b();
                    if (b17 != null) {
                        if (!(b17.length == 0)) {
                            java.lang.String str = b17[0];
                            java.lang.String str2 = "*";
                            if (r0Var.d()) {
                                if (r26.i0.p("image/*", str, true)) {
                                    str2 = "camera";
                                } else if (r26.i0.p("video/*", str, true)) {
                                    str2 = "camcorder";
                                }
                            }
                            f0Var.a((android.app.Activity) context, this.f385953a, null, valueCallback, str, str2);
                            if (context instanceof x54.b) {
                                ((x54.b) context).L2(2003, new k54.e(context, f0Var));
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                            return true;
                        }
                    }
                    ot5.g.c("SnsAd.WebViewChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                return false;
            }
        }
        ot5.g.d("SnsAd.WebViewChromeClient", "the activity is finished, or callback is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        return false;
    }
}
