package r54;

/* loaded from: classes4.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t, j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.Reference f474264a;

    /* renamed from: b, reason: collision with root package name */
    public final r54.c f474265b;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f474267d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474268e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f474269f = new r54.a(this);

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f474266c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public d(android.content.Context context, r54.c cVar) {
        this.f474264a = new java.lang.ref.WeakReference(context);
        this.f474265b = cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        if (obj instanceof android.os.Bundle) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) obj;
                bundle.setClassLoader(r54.d.class.getClassLoader());
                int i17 = 0;
                boolean b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.b(bundle, "result", false);
                double n17 = a84.g0.n(bundle, "latitude", 0.0d);
                double n18 = a84.g0.n(bundle, "longitude", 0.0d);
                double n19 = a84.g0.n(bundle, "accuracy", 0.0d);
                double n27 = a84.g0.n(bundle, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, 0.0d);
                if (!b17) {
                    i17 = 2;
                }
                d(i17, b17 ? "get_location:ok" : "get_location:failed", n17, n18, n27, n19);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    public final void c(int i17, java.lang.String str, double d17, double d18, double d19, double d27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        try {
            if (!this.f474267d) {
                this.f474267d = true;
                if (this.f474265b != null) {
                    android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                    arrayMap.put("ret", java.lang.Integer.valueOf(i17));
                    arrayMap.put("err_msg", str);
                    if (i17 == 0) {
                        arrayMap.put("latitude", java.lang.Double.valueOf(d17));
                        arrayMap.put("longitude", java.lang.Double.valueOf(d18));
                        arrayMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, java.lang.Double.valueOf(d19));
                        arrayMap.put("accuracy", java.lang.Double.valueOf(d27));
                    }
                    ((eb4.m) this.f474265b).a(arrayMap);
                }
                this.f474266c.mo50300x3fa464aa(this.f474269f);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GeoClientRequester", "the do Callback has something wrong");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    public final void d(int i17, java.lang.String str, double d17, double d18, double d19, double d27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCallbackInUIThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            c(i17, str, d17, d18, d19, d27);
        } else {
            this.f474266c.mo50293x3498a0(new r54.b(this, i17, str, d17, d18, d19, d27));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCallbackInUIThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    public final boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        android.content.Context context = (android.content.Context) this.f474264a.get();
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            return false;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            return true;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        j35.u.j(context, 1, this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}, null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        return false;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        boolean z17 = true;
        if (i17 == 1) {
            if (iArr != null) {
                try {
                    int length = iArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            break;
                        }
                        if (iArr[i18] != 0) {
                            z17 = false;
                            break;
                        }
                        i18++;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            if (z17) {
                java.lang.String str = this.f474268e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                if (str == null) {
                    str = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69843x7d3b226(str, this);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCallbackWithoutPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                d(1, "get_location:no_permission", 0.0d, 0.0d, 0.0d, 0.0d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCallbackWithoutPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }
}
