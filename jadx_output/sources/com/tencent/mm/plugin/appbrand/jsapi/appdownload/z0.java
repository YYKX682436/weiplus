package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes15.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f78981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f78982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f78983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 f78984g;

    public z0(com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 a1Var, int i17, int i18, com.tencent.mm.modelbase.o oVar) {
        this.f78984g = a1Var;
        this.f78981d = i17;
        this.f78982e = i18;
        this.f78983f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str;
        int i17 = this.f78981d;
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 a1Var = this.f78984g;
        if (i17 != 0 || this.f78982e != 0) {
            a1Var.f78930a.a(a1Var.f78931b, a1Var.f78939j.o("fail:check fail"));
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f78983f.f70711b.f70700a;
        int i18 = l14Var.f379071e;
        if (i18 != 0) {
            if (i18 != 2) {
                a1Var.f78930a.a(a1Var.f78931b, a1Var.f78939j.o("fail:check fail 1"));
                return;
            } else {
                a1Var.f78930a.a(a1Var.f78931b, a1Var.f78939j.o("fail:check fail forbidden scene 2"));
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.e1 e1Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.e1(new com.tencent.mm.plugin.appbrand.jsapi.appdownload.w0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f379072f), java.lang.Integer.valueOf(l14Var.f379071e));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(a1Var.f78932c);
        com.tencent.mm.plugin.appbrand.e9 e9Var = a1Var.f78930a;
        if (!K0) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(a1Var.f78932c));
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
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str2.equals(str)) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.appdownload.x0(this, intent, l14Var, e1Var));
                    return;
                }
            }
        }
        java.lang.String str3 = a1Var.f78934e;
        boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
        android.os.Bundle bundle = a1Var.f78933d;
        java.lang.String str4 = a1Var.f78936g;
        if (!K02) {
            java.lang.String str5 = a1Var.f78935f;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && (a17 = com.tencent.mm.pluginsdk.model.app.c.a(e9Var.Z0(), str3, false)) != null && (signature = a17[0]) != null) {
                java.lang.String g17 = kk.k.g(signature.toByteArray());
                if (g17 == null || !g17.equalsIgnoreCase(str5)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication signature not match");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getLaunchIntentForPackage(str3);
                        if (launchIntentForPackage != null) {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            com.tencent.mm.pluginsdk.model.app.j1.i(bundle2, str4);
                            launchIntentForPackage.putExtras(bundle2);
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                            android.app.Activity Z0 = e9Var.Z0();
                            ((kt.c) i0Var2).getClass();
                            e1Var.b(com.tencent.mm.pluginsdk.model.app.w.v(Z0, launchIntentForPackage, null, e1Var, bundle));
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask jsApiLaunchApplicationForNative$LaunchApplicationTask = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask(e9Var.t3().r0());
        jsApiLaunchApplicationForNative$LaunchApplicationTask.f78880m = a1Var.f78937h;
        jsApiLaunchApplicationForNative$LaunchApplicationTask.f78881n = str4;
        jsApiLaunchApplicationForNative$LaunchApplicationTask.f78882o = a1Var.f78938i;
        jsApiLaunchApplicationForNative$LaunchApplicationTask.f78883p = bundle;
        jsApiLaunchApplicationForNative$LaunchApplicationTask.f78879i = l14Var.f379072f;
        jsApiLaunchApplicationForNative$LaunchApplicationTask.f78885r = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.y0(this, jsApiLaunchApplicationForNative$LaunchApplicationTask);
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78363h).add(jsApiLaunchApplicationForNative$LaunchApplicationTask);
        jsApiLaunchApplicationForNative$LaunchApplicationTask.a();
    }
}
