package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f80159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d7 f80160g;

    public c7(com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var, int i17, int i18, com.tencent.mm.modelbase.o oVar) {
        this.f80160g = d7Var;
        this.f80157d = i17;
        this.f80158e = i18;
        this.f80159f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str;
        int i17 = this.f80157d;
        com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var = this.f80160g;
        if (i17 != 0 || this.f80158e != 0) {
            com.tencent.mm.plugin.appbrand.e9 e9Var = d7Var.f80739a;
            com.tencent.mm.plugin.appbrand.jsapi.i7 i7Var = d7Var.f80749k;
            e9Var.a(d7Var.f80740b, i7Var.o("fail:check fail"));
            i7Var.D(d7Var.f80741c, "fail", "fail:check fail");
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f80159f.f70711b.f70700a;
        int i18 = l14Var.f379071e;
        if (i18 != 0) {
            if (i18 != 2) {
                com.tencent.mm.plugin.appbrand.e9 e9Var2 = d7Var.f80739a;
                com.tencent.mm.plugin.appbrand.jsapi.i7 i7Var2 = d7Var.f80749k;
                e9Var2.a(d7Var.f80740b, i7Var2.o("fail:check fail 1"));
                i7Var2.D(d7Var.f80741c, "fail", "fail:check fail 1");
                return;
            }
            com.tencent.mm.plugin.appbrand.e9 e9Var3 = d7Var.f80739a;
            com.tencent.mm.plugin.appbrand.jsapi.i7 i7Var3 = d7Var.f80749k;
            e9Var3.a(d7Var.f80740b, i7Var3.o("fail:check fail forbidden scene 2"));
            i7Var3.D(d7Var.f80741c, "fail", "fail:check fail forbidden scene 2");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.h7 h7Var = new com.tencent.mm.plugin.appbrand.jsapi.h7(new com.tencent.mm.plugin.appbrand.jsapi.z6(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f379072f), java.lang.Integer.valueOf(l14Var.f379071e));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(d7Var.f80742d);
        com.tencent.mm.plugin.appbrand.e9 e9Var4 = d7Var.f80739a;
        if (!K0) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(d7Var.f80742d));
            intent.addFlags(268435456);
            java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(e9Var4.getF147807d(), intent);
            if (w17 != null && !w17.isEmpty()) {
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17.size() == 1) {
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
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.a7(this, intent, l14Var, h7Var));
                    return;
                }
            }
        }
        java.lang.String str3 = d7Var.f80744f;
        boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
        android.os.Bundle bundle = d7Var.f80743e;
        java.lang.String str4 = d7Var.f80746h;
        if (!K02) {
            java.lang.String str5 = d7Var.f80745g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && (a17 = com.tencent.mm.pluginsdk.model.app.c.a(e9Var4.Z0(), str3, false)) != null && (signature = a17[0]) != null) {
                java.lang.String g17 = kk.k.g(signature.toByteArray());
                if (g17 == null || !g17.equalsIgnoreCase(str5)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication signature not match");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getLaunchIntentForPackage(str3);
                        if (launchIntentForPackage != null) {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            com.tencent.mm.pluginsdk.model.app.j1.i(bundle2, str4);
                            launchIntentForPackage.putExtras(bundle2);
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                            android.app.Activity Z0 = e9Var4.Z0();
                            ((kt.c) i0Var2).getClass();
                            h7Var.b(com.tencent.mm.pluginsdk.model.app.w.v(Z0, launchIntentForPackage, null, h7Var, bundle));
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask jsApiLaunchApplication$LaunchApplicationTask = new com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask(e9Var4.t3().r0());
        jsApiLaunchApplication$LaunchApplicationTask.f78532m = d7Var.f80747i;
        jsApiLaunchApplication$LaunchApplicationTask.f78533n = str4;
        jsApiLaunchApplication$LaunchApplicationTask.f78534o = d7Var.f80748j;
        jsApiLaunchApplication$LaunchApplicationTask.f78535p = bundle;
        jsApiLaunchApplication$LaunchApplicationTask.f78531i = l14Var.f379072f;
        jsApiLaunchApplication$LaunchApplicationTask.f78537r = new com.tencent.mm.plugin.appbrand.jsapi.b7(this, jsApiLaunchApplication$LaunchApplicationTask);
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78363h).add(jsApiLaunchApplication$LaunchApplicationTask);
        jsApiLaunchApplication$LaunchApplicationTask.a();
    }
}
