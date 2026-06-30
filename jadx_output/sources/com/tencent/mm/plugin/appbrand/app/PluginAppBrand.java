package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.e1.class})
/* loaded from: classes7.dex */
public final class PluginAppBrand extends i95.w implements l81.m0, com.tencent.mm.plugin.appbrand.fc {
    public static final java.lang.String TAG = "MicroMsg.PluginAppBrand[speedtest]";
    private com.tencent.mm.plugin.appbrand.appcache.sa mWxaPkgStorageRouter;

    private void configure() {
    }

    public static android.content.SharedPreferences getProcessSharedPrefs() {
        return com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
    }

    private void installed() {
        com.tencent.mars.xlog.Log.i(TAG, "installed()");
    }

    public static boolean isAppBrandProcess() {
        try {
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
            return ((km0.c) gm0.j1.p().a()).f308987a.startsWith(str + ":appbrand");
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean isSupportProcess() {
        try {
            return com.tencent.mm.sdk.platformtools.w9.f193063k.equals(((km0.c) gm0.j1.p().a()).f308987a);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.fc
    public void deliveryInstall(com.tencent.mm.plugin.appbrand.ec ecVar) {
        l30.h hVar = (l30.h) i95.n0.c(l30.h.class);
        com.tencent.mm.plugin.appbrand.app.f8 f8Var = new com.tencent.mm.plugin.appbrand.app.f8(this, ecVar);
        ((k30.a) hVar).getClass();
        com.tencent.mm.plugin.expansions.i0.c(f8Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.fc
    public boolean deliveryInstalled() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        return true;
    }

    @Override // l81.m0
    public void ensureWxaDecodeKeyFileCopied() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getFilesDir().getAbsolutePath() + "/wasae.dat";
        if (com.tencent.mm.vfs.w6.j(str) && "43bff1e72298b0ea0b73e2960d3c97b8".equals(com.tencent.mm.vfs.w6.p(str))) {
            return;
        }
        com.tencent.mm.sdk.platformtools.k1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "wasae.dat", str);
    }

    public void execute() {
        com.tencent.mars.xlog.Log.i(TAG, "execute() current process name = %s, isMainThread %b", ((km0.c) gm0.j1.p().a()).f308987a, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.u3.e()));
        if (isAppBrandProcess()) {
            new com.tencent.luggage.sdk.processes.main.LuggageInitTask(bm5.f1.a()).d();
        }
        cf.i.b("WeChatMultiProcessInitDelegateImpl", new com.tencent.mm.plugin.appbrand.app.g8(this));
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            isAppBrandProcess();
            com.tencent.mm.sdk.platformtools.x2.s();
            isAppBrandProcess();
        } else if (((com.tencent.mm.plugin.appbrand.debugger.j0) i95.n0.c(com.tencent.mm.plugin.appbrand.debugger.j0.class)) != null) {
            q25.b.b(new com.tencent.mm.plugin.appbrand.p(), "//wagame", "//enable_appbrand_monkey_test", "//disable_appbrand_monkey_test", "//appbrand_monkey_bringtofront", "//appbrand_monkey_test_skip_appbrand_process_suicide", "//appbrand_predownload_trigger", "//appbrand_opensdk_export_prefetch_trigger", "//callsearchshowoutwxaapp", "//getsearchshowoutwxaapp", "//appbrandtest", "//wxafts", "//wxatest", "//xweb_video_player", "//appbrand_video", "//appbrand_tp_download_strategy", "//showad", "//allshowad", "//localwxalibrary", "//enable_appbrand_file_size_statistics_debug", "//enableweappallhalfscreen", "//deletexnetlibdebugdir", "//xnetusingdebugso", "//appbrand_file_clean", "//appbrand_switch_render", "//appbrand_service_debug", "//appbrand_clean");
        } else {
            q25.b.b(new com.tencent.mm.plugin.appbrand.app.h8(this), "//enable_appbrand_monkey_test", "//disable_appbrand_monkey_test");
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            com.tencent.mm.plugin.appbrand.debugger.console.n0.f77690a.a();
        }
    }

    public com.tencent.mm.plugin.appbrand.appcache.sa getWxaPkgStorageRouter() {
        if (this.mWxaPkgStorageRouter == null) {
            this.mWxaPkgStorageRouter = new com.tencent.mm.plugin.appbrand.appcache.sa(com.tencent.mm.plugin.appbrand.app.r9.Di(), (com.tencent.mm.plugin.appbrand.appcache.k9) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.k9.class));
        }
        return this.mWxaPkgStorageRouter;
    }

    @Override // com.tencent.mm.plugin.appbrand.fc
    public boolean isOnPowerSavedMode() {
        return wh.e1.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        installed();
        configure();
        execute();
    }

    public void requireAndWaitForAccountInitialized() {
        requireAccountInitialized();
    }

    @Override // com.tencent.mm.plugin.appbrand.fc
    public void waitFor() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.appbrand.task.u0.C();
        }
    }
}
