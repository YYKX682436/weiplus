package ca4;

/* loaded from: classes15.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f39827a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f39828b;

    /* renamed from: c, reason: collision with root package name */
    public kd0.p2 f39829c;

    /* renamed from: d, reason: collision with root package name */
    public int f39830d;

    /* renamed from: e, reason: collision with root package name */
    public int f39831e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.String f39832f;

    /* renamed from: g, reason: collision with root package name */
    public int f39833g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f39834h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f39835i;

    /* renamed from: j, reason: collision with root package name */
    public final ab4.n0 f39836j;

    /* renamed from: k, reason: collision with root package name */
    public final int f39837k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f39838l;

    /* renamed from: m, reason: collision with root package name */
    public int f39839m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f39840n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.ref.WeakReference f39841o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f39842p;

    public b0(android.content.Context context, ab4.n0 n0Var, int i17, android.os.Bundle bundle) {
        this.f39827a = context;
        this.f39836j = n0Var;
        this.f39837k = i17;
        if (com.tencent.mm.sdk.platformtools.c2.b(bundle, "qrInitBottomSheet", true)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            if (this.f39829c != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            } else {
                this.f39828b = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
                ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
                this.f39829c = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f39828b;
                k0Var.X1 = true;
                k0Var.f211872n = new ca4.r(this);
                k0Var.p(new ca4.s(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            }
        }
        this.f39842p = bundle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseExtraParams", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        try {
            java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "qrExtInfo");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f39838l = k17 == null ? "" : k17;
            this.f39839m = com.tencent.mm.sdk.platformtools.c2.f(bundle, "qrIsDirectJump", 0);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "there is something wrong in parseExtraParams");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseExtraParams", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 a(ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = b0Var.f39828b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return k0Var;
    }

    public static /* synthetic */ android.content.Context b(ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        android.content.Context context = b0Var.f39827a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return context;
    }

    public static /* synthetic */ java.lang.String c(ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        java.lang.String str = b0Var.f39832f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return str;
    }

    public static /* synthetic */ int d(ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i17 = b0Var.f39830d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return i17;
    }

    public static /* synthetic */ ab4.n0 e(ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        ab4.n0 n0Var = b0Var.f39836j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return n0Var;
    }

    public static /* synthetic */ android.os.Bundle f(ca4.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        android.os.Bundle bundle = b0Var.f39842p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return bundle;
    }

    public static org.json.JSONObject h(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("qrResult", i17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("qrUrl", str2);
            jSONObject.put("qrResultUrlType", i18);
            jSONObject.put("qrResultUrl", str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "buildExtDataForSearchJsapi exp: " + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject;
    }

    public static void q(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportScanResultForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("extInfo", h(i17, str, str2, i18));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("uxinfo", str3);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "buildCgiReportDataForSearchJsapi exp: " + e17);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.tencent.mars.xlog.Log.i("SnsAdQRHelper", "buildCgiReportDataForSearchJsapi ret: " + jSONObject2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        ca4.m0.a("search_ad_jsapi_qr_scan_result", jSONObject2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScanResultForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public java.lang.String g(int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            ab4.n0 n0Var = this.f39836j;
            org.json.JSONObject i18 = i(i17, str, z17);
            java.lang.String o17 = n0Var.o();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (o17 == null) {
                o17 = "";
            }
            java.lang.String k17 = n0Var.k();
            int l17 = n0Var.l();
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(n0Var.e());
            jSONObject.put("extInfo", i18);
            jSONObject.put("uxinfo", o17);
            jSONObject.put("snsId", k17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, l17);
            jSONObject.put("canvasId", E1);
            if (!android.text.TextUtils.isEmpty(n0Var.a())) {
                jSONObject.put("adExtInfo", n0Var.a());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "buildCgiReportData exp:" + e17.toString());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject2;
    }

    public org.json.JSONObject i(int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", i17);
            jSONObject.put("qrResult", z17 ? 0 : 1);
            jSONObject.put("qrUrl", this.f39835i);
            jSONObject.put("qrResultUrl", str);
            jSONObject.put("qrExtInfo", this.f39838l);
            jSONObject.put("directJump", this.f39839m);
            int i18 = this.f39833g;
            if (i18 != 0) {
                jSONObject.put("qrResultUrlType", i18);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "buildKVData exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject;
    }

    public boolean j(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
        if (com.tencent.mm.plugin.scanner.z0.o(i17, str)) {
            this.f39833g = 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.tencent.mm.plugin.scanner.z0.d(i17, str)) {
            this.f39833g = 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.tencent.mm.plugin.scanner.z0.l(i17, str)) {
            this.f39833g = 4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.tencent.mm.plugin.scanner.z0.h(i17, str)) {
            this.f39833g = 5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.tencent.mm.plugin.scanner.z0.n(i17, str)) {
            this.f39833g = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (!com.tencent.mm.plugin.scanner.z0.i(i17, str, true)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        this.f39833g = 6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    public boolean k(java.lang.String str, java.lang.String str2, ca4.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f39834h = str;
        this.f39835i = str2;
        com.tencent.mars.xlog.Log.i("SnsAdQRHelper", "onClickDirect, filePath=" + this.f39834h);
        if (android.text.TextUtils.isEmpty(this.f39834h)) {
            if (a0Var != null) {
                a0Var.a(str2, false, "imgPath is empty", this.f39842p);
            }
            m();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        zs5.u0.f475485h.a(this.f39827a, currentTimeMillis, this.f39834h, new ca4.y(this, a0Var, str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    public boolean l(java.lang.String str, java.lang.String str2, ca4.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f39834h = str;
        this.f39835i = str2;
        com.tencent.mars.xlog.Log.i("SnsAdQRHelper", "onLongClick, filePath=" + this.f39834h);
        if (android.text.TextUtils.isEmpty(this.f39834h)) {
            if (a0Var != null) {
                a0Var.a(str2, false, "imgPath is empty", this.f39842p);
            }
            m();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        zs5.u0.f475485h.a(this.f39827a, currentTimeMillis, this.f39834h, new ca4.x(this, a0Var, str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reSet", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f39832f = "";
        this.f39830d = -1;
        this.f39834h = "";
        this.f39835i = "";
        this.f39831e = 0;
        this.f39833g = 0;
        this.f39842p = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reSet", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public void n(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportImgLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i17 = this.f39837k;
        int i18 = i17 != 1 ? i17 == 2 ? 6 : i17 == 3 ? 8 : 0 : 2;
        o(i(i18, str, z17).toString());
        ca4.m0.a(java.lang.String.valueOf(17539), g(i18, str, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportImgLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public void o(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportKV17539", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        try {
            ab4.n0 n0Var = this.f39836j;
            java.lang.String k17 = n0Var.k();
            java.lang.String o17 = n0Var.o();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = "";
            if (o17 == null) {
                o17 = "";
            }
            java.lang.String c17 = n0Var.c();
            if (c17 != null) {
                str2 = c17;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17539, k17, str2, o17, java.lang.Integer.valueOf(n0Var.l()), java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdQRHelper", "reportKV17539 exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportKV17539", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public void p(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMenuItemClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i17 = this.f39837k;
        int i18 = i17 != 1 ? i17 == 2 ? 7 : i17 == 3 ? 9 : 0 : 3;
        o(i(i18, str, z17).toString());
        ca4.m0.a(java.lang.String.valueOf(17539), g(i18, str, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMenuItemClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public b0(android.content.Context context, java.lang.String str) {
        this.f39841o = new java.lang.ref.WeakReference(context);
        this.f39840n = str;
    }
}
