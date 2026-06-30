package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f82379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.o7 f82380g;

    public n7(com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var, int i17, int i18, com.tencent.mm.modelbase.o oVar) {
        this.f82380g = o7Var;
        this.f82377d = i17;
        this.f82378e = i18;
        this.f82379f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean a17;
        int i17;
        int i18 = this.f82377d;
        com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var = this.f82380g;
        if (i18 != 0 || this.f82378e != 0) {
            o7Var.f82448a.a(o7Var.f82449b, o7Var.f82460m.o("fail:check fail"));
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f82379f.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication check result(showType:%d, errCode:%d, jumpFlog:%d)", java.lang.Integer.valueOf(l14Var.f379072f), java.lang.Integer.valueOf(l14Var.f379071e), java.lang.Integer.valueOf(l14Var.f379073g));
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        boolean z17 = L != null ? L.getBoolean("AppBrandLaunchApplicationMockLogic#forceCheckLaunchAppSuccess", false) : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchApplicationMockLogic", "forceCheckLaunchAppSuccess#get, value: " + z17);
        if (!z17 && (i17 = l14Var.f379071e) != 0) {
            if (i17 != 2) {
                o7Var.f82448a.a(o7Var.f82449b, o7Var.f82460m.o("fail:check fail 1"));
                return;
            } else {
                o7Var.f82448a.a(o7Var.f82449b, o7Var.f82460m.o("fail:check fail forbidden scene 2"));
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.c1 c1Var = com.tencent.mm.plugin.appbrand.jsapi.c1.f80154a;
        boolean a18 = c1Var.a(o7Var.f82450c);
        java.lang.String str2 = o7Var.f82452e;
        java.lang.String str3 = o7Var.f82451d;
        com.tencent.mm.plugin.appbrand.e9 e9Var = o7Var.f82448a;
        if (!a18) {
            if (str3 == null) {
                a17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByAppId, appId: ".concat(str3));
                com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) uk0.a.d(new com.tencent.mm.ipcinvoker.type.IPCString(str3), com.tencent.mm.plugin.appbrand.jsapi.b1.f79815a);
                if (iPCBoolean != null ? iPCBoolean.f68400d : false) {
                    a17 = true;
                } else {
                    a17 = c1Var.a(str3 + "://" + str2);
                }
            }
            if (!a17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, no weishi app");
                if (l14Var.f379073g == 1) {
                    e9Var.a(o7Var.f82449b, o7Var.f82460m.o("fail:install app denied"));
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, no weishi app, go download it");
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.j7(this));
                    return;
                }
            }
        }
        java.lang.String str4 = o7Var.f82450c;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            intent.addFlags(268435456);
            java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(e9Var.getF147807d(), intent);
            if ((w17 != null && !w17.isEmpty()) || com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var).getClass();
                    str = com.tencent.mm.pluginsdk.model.app.w.o(resolveInfo);
                } else {
                    str = intent.getPackage();
                }
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                if (str5 == null) {
                    str5 = "";
                }
                if (!str5.equals(str)) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.l7(this, intent, l14Var, new com.tencent.mm.plugin.appbrand.jsapi.w7(new com.tencent.mm.plugin.appbrand.jsapi.k7(this))));
                    return;
                }
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask jsApiLaunchApplicationDirectly$LaunchApplicationTask = new com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask(e9Var.t3().r0());
        jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78557m = str3;
        jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78558n = str2;
        jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78559o = o7Var.f82459l;
        jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78560p = o7Var.f82458k;
        jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78556i = l14Var.f379072f;
        jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78562r = new com.tencent.mm.plugin.appbrand.jsapi.m7(this, jsApiLaunchApplicationDirectly$LaunchApplicationTask);
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78363h).add(jsApiLaunchApplicationDirectly$LaunchApplicationTask);
        jsApiLaunchApplicationDirectly$LaunchApplicationTask.a();
    }
}
