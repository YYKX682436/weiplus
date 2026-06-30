package ca4;

/* loaded from: classes15.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f121360a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f121361b;

    /* renamed from: c, reason: collision with root package name */
    public kd0.p2 f121362c;

    /* renamed from: d, reason: collision with root package name */
    public int f121363d;

    /* renamed from: e, reason: collision with root package name */
    public int f121364e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.String f121365f;

    /* renamed from: g, reason: collision with root package name */
    public int f121366g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f121367h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f121368i;

    /* renamed from: j, reason: collision with root package name */
    public final ab4.n0 f121369j;

    /* renamed from: k, reason: collision with root package name */
    public final int f121370k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f121371l;

    /* renamed from: m, reason: collision with root package name */
    public int f121372m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f121373n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.ref.WeakReference f121374o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f121375p;

    public b0(android.content.Context context, ab4.n0 n0Var, int i17, android.os.Bundle bundle) {
        this.f121360a = context;
        this.f121369j = n0Var;
        this.f121370k = i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.b(bundle, "qrInitBottomSheet", true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            if (this.f121362c != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            } else {
                this.f121361b = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
                ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
                this.f121362c = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(context);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f121361b;
                k0Var.X1 = true;
                k0Var.f293405n = new ca4.r(this);
                k0Var.p(new ca4.s(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initScanCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            }
        }
        this.f121375p = bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseExtraParams", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        try {
            java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "qrExtInfo");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f121371l = k17 == null ? "" : k17;
            this.f121372m = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "qrIsDirectJump", 0);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "there is something wrong in parseExtraParams");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseExtraParams", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 a(ca4.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = b0Var.f121361b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return k0Var;
    }

    public static /* synthetic */ android.content.Context b(ca4.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        android.content.Context context = b0Var.f121360a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return context;
    }

    public static /* synthetic */ java.lang.String c(ca4.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        java.lang.String str = b0Var.f121365f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return str;
    }

    public static /* synthetic */ int d(ca4.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i17 = b0Var.f121363d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return i17;
    }

    public static /* synthetic */ ab4.n0 e(ca4.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        ab4.n0 n0Var = b0Var.f121369j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return n0Var;
    }

    public static /* synthetic */ android.os.Bundle f(ca4.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        android.os.Bundle bundle = b0Var.f121375p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return bundle;
    }

    public static org.json.JSONObject h(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("qrResult", i17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("qrUrl", str2);
            jSONObject.put("qrResultUrlType", i18);
            jSONObject.put("qrResultUrl", str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "buildExtDataForSearchJsapi exp: " + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject;
    }

    public static void q(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportScanResultForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("extInfo", h(i17, str, str2, i18));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("uxinfo", str3);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "buildCgiReportDataForSearchJsapi exp: " + e17);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", "buildCgiReportDataForSearchJsapi ret: " + jSONObject2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        ca4.m0.a("search_ad_jsapi_qr_scan_result", jSONObject2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScanResultForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public java.lang.String g(int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            ab4.n0 n0Var = this.f121369j;
            org.json.JSONObject i18 = i(i17, str, z17);
            java.lang.String o17 = n0Var.o();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (o17 == null) {
                o17 = "";
            }
            java.lang.String k17 = n0Var.k();
            int l17 = n0Var.l();
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(n0Var.e());
            jSONObject.put("extInfo", i18);
            jSONObject.put("uxinfo", o17);
            jSONObject.put("snsId", k17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, l17);
            jSONObject.put("canvasId", E1);
            if (!android.text.TextUtils.isEmpty(n0Var.a())) {
                jSONObject.put("adExtInfo", n0Var.a());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "buildCgiReportData exp:" + e17.toString());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCgiReportData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject2;
    }

    public org.json.JSONObject i(int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", i17);
            jSONObject.put("qrResult", z17 ? 0 : 1);
            jSONObject.put("qrUrl", this.f121368i);
            jSONObject.put("qrResultUrl", str);
            jSONObject.put("qrExtInfo", this.f121371l);
            jSONObject.put("directJump", this.f121372m);
            int i18 = this.f121366g;
            if (i18 != 0) {
                jSONObject.put("qrResultUrlType", i18);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "buildKVData exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildExtData", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return jSONObject;
    }

    public boolean j(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(i17, str)) {
            this.f121366g = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.d(i17, str)) {
            this.f121366g = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.l(i17, str)) {
            this.f121366g = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.h(i17, str)) {
            this.f121366g = 5;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.n(i17, str)) {
            this.f121366g = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return true;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.i(i17, str, true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        this.f121366g = 6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidQRCode", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    public boolean k(java.lang.String str, java.lang.String str2, ca4.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f121367h = str;
        this.f121368i = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", "onClickDirect, filePath=" + this.f121367h);
        if (android.text.TextUtils.isEmpty(this.f121367h)) {
            if (a0Var != null) {
                a0Var.a(str2, false, "imgPath is empty", this.f121375p);
            }
            m();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        zs5.u0.f557018h.a(this.f121360a, currentTimeMillis, this.f121367h, new ca4.y(this, a0Var, str2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDirect", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    public boolean l(java.lang.String str, java.lang.String str2, ca4.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f121367h = str;
        this.f121368i = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", "onLongClick, filePath=" + this.f121367h);
        if (android.text.TextUtils.isEmpty(this.f121367h)) {
            if (a0Var != null) {
                a0Var.a(str2, false, "imgPath is empty", this.f121375p);
            }
            m();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        zs5.u0.f557018h.a(this.f121360a, currentTimeMillis, this.f121367h, new ca4.x(this, a0Var, str2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        return true;
    }

    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reSet", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        this.f121365f = "";
        this.f121363d = -1;
        this.f121367h = "";
        this.f121368i = "";
        this.f121364e = 0;
        this.f121366g = 0;
        this.f121375p = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reSet", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public void n(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportImgLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i17 = this.f121370k;
        int i18 = i17 != 1 ? i17 == 2 ? 6 : i17 == 3 ? 8 : 0 : 2;
        o(i(i18, str, z17).toString());
        ca4.m0.a(java.lang.String.valueOf(17539), g(i18, str, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportImgLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public void o(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportKV17539", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        try {
            ab4.n0 n0Var = this.f121369j;
            java.lang.String k17 = n0Var.k();
            java.lang.String o17 = n0Var.o();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = "";
            if (o17 == null) {
                o17 = "";
            }
            java.lang.String c17 = n0Var.c();
            if (c17 != null) {
                str2 = c17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17539, k17, str2, o17, java.lang.Integer.valueOf(n0Var.l()), java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "reportKV17539 exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportKV17539", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public void p(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMenuItemClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i17 = this.f121370k;
        int i18 = i17 != 1 ? i17 == 2 ? 7 : i17 == 3 ? 9 : 0 : 3;
        o(i(i18, str, z17).toString());
        ca4.m0.a(java.lang.String.valueOf(17539), g(i18, str, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMenuItemClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
    }

    public b0(android.content.Context context, java.lang.String str) {
        this.f121374o = new java.lang.ref.WeakReference(context);
        this.f121373n = str;
    }
}
