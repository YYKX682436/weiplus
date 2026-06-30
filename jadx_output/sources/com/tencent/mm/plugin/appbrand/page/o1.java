package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class o1 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f86937f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f86938g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.page.o1 f86939h = new com.tencent.mm.plugin.appbrand.page.d1(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f86940a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f86941b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.AppCommentModule f86942c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86943d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f86944e;

    public o1(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f86940a = appBrandRuntime;
        if (appBrandRuntime == null) {
            return;
        }
        appBrandRuntime.N.a(new com.tencent.mm.plugin.appbrand.page.e1(this, appBrandRuntime));
    }

    public static void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "initDeveloperServiceInfo appId:%s", str);
        java.util.HashMap hashMap = f86938g;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "init dsInfo ready done", str);
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.page.f1(str));
        }
    }

    public java.lang.String b() {
        return this.f86940a.E0().f305841d;
    }

    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.appcache.p.a(this.f86940a.E0().f305852r.f75399d);
    }

    public java.lang.Runnable d(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        com.tencent.mm.plugin.appbrand.page.g1 g1Var = new com.tencent.mm.plugin.appbrand.page.g1(this);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f86940a;
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) appBrandRuntime.E0();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) appBrandRuntime.u0();
        return (appBrandSysConfigLU == null || appBrandInitConfigLU == null) ? g1Var : new com.tencent.mm.plugin.appbrand.page.h1(this, appBrandInitConfigLU, bVar, appBrandSysConfigLU);
    }

    public java.lang.String e() {
        return this.f86940a.E0().f305843f;
    }

    public com.tencent.mm.plugin.appbrand.page.n1 f(int i17) {
        if (i17 == 0) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.n1 n1Var = new com.tencent.mm.plugin.appbrand.page.n1();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i17 == 1) {
            n1Var.f86895c = context.getString(com.tencent.mm.R.string.a2y);
            n1Var.f86894b = com.tencent.mm.R.raw.appbrand_menu_header_lbs;
            n1Var.f86893a = com.tencent.mm.R.drawable.f480797ct;
        } else if (i17 == 3) {
            n1Var.f86895c = context.getString(com.tencent.mm.R.string.m4m);
            n1Var.f86894b = com.tencent.mm.R.raw.appbrand_menu_header_camera_white;
            n1Var.f86893a = com.tencent.mm.R.drawable.f480798cu;
        } else {
            if (i17 != 2) {
                return null;
            }
            n1Var.f86895c = context.getString(com.tencent.mm.R.string.a2z);
            n1Var.f86894b = com.tencent.mm.R.raw.appbrand_menu_header_record_voice;
            n1Var.f86893a = com.tencent.mm.R.drawable.f480798cu;
        }
        return n1Var;
    }
}
