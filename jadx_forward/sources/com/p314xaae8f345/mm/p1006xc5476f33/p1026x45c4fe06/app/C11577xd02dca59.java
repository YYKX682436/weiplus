package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e1.class})
/* renamed from: com.tencent.mm.plugin.appbrand.app.PluginAppBrand */
/* loaded from: classes7.dex */
public final class C11577xd02dca59 extends i95.w implements l81.m0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc {
    public static final java.lang.String TAG = "MicroMsg.PluginAppBrand[speedtest]";

    /* renamed from: mWxaPkgStorageRouter */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.sa f33430xb98a674b;

    /* renamed from: configure */
    private void m48888xd00d62e6() {
    }

    /* renamed from: getProcessSharedPrefs */
    public static android.content.SharedPreferences m48889xc55ddd52() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
    }

    /* renamed from: installed */
    private void m48890x1bb377a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "installed()");
    }

    /* renamed from: isAppBrandProcess */
    public static boolean m48891xd8decb1f() {
        try {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
            return ((km0.c) gm0.j1.p().a()).f390520a.startsWith(str + ":appbrand");
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: isSupportProcess */
    public static boolean m48892xf615276a() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274596k.equals(((km0.c) gm0.j1.p().a()).f390520a);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc
    /* renamed from: deliveryInstall */
    public void mo48893xf78c0707(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ec ecVar) {
        l30.h hVar = (l30.h) i95.n0.c(l30.h.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.f8 f8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.f8(this, ecVar);
        ((k30.a) hVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.c(f8Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc
    /* renamed from: deliveryInstalled */
    public boolean mo48894x44a66de6() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        return true;
    }

    @Override // l81.m0
    /* renamed from: ensureWxaDecodeKeyFileCopied */
    public void mo48895x38e387ef() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getFilesDir().getAbsolutePath() + "/wasae.dat";
        if (com.p314xaae8f345.mm.vfs.w6.j(str) && "43bff1e72298b0ea0b73e2960d3c97b8".equals(com.p314xaae8f345.mm.vfs.w6.p(str))) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "wasae.dat", str);
    }

    /* renamed from: execute */
    public void m48896xb158f775() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "execute() current process name = %s, isMainThread %b", ((km0.c) gm0.j1.p().a()).f390520a, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()));
        if (m48891xd8decb1f()) {
            new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3944x3dc04ceb(bm5.f1.a()).d();
        }
        cf.i.b("WeChatMultiProcessInitDelegateImpl", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g8(this));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            m48891xd8decb1f();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s();
            m48891xd8decb1f();
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0.class)) != null) {
            q25.b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p(), "//wagame", "//enable_appbrand_monkey_test", "//disable_appbrand_monkey_test", "//appbrand_monkey_bringtofront", "//appbrand_monkey_test_skip_appbrand_process_suicide", "//appbrand_predownload_trigger", "//appbrand_opensdk_export_prefetch_trigger", "//callsearchshowoutwxaapp", "//getsearchshowoutwxaapp", "//appbrandtest", "//wxafts", "//wxatest", "//xweb_video_player", "//appbrand_video", "//appbrand_tp_download_strategy", "//showad", "//allshowad", "//localwxalibrary", "//enable_appbrand_file_size_statistics_debug", "//enableweappallhalfscreen", "//deletexnetlibdebugdir", "//xnetusingdebugso", "//appbrand_file_clean", "//appbrand_switch_render", "//appbrand_service_debug", "//appbrand_clean");
        } else {
            q25.b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.h8(this), "//enable_appbrand_monkey_test", "//disable_appbrand_monkey_test");
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159223a.a();
        }
    }

    /* renamed from: getWxaPkgStorageRouter */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.sa m48897x271e35c2() {
        if (this.f33430xb98a674b == null) {
            this.f33430xb98a674b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.sa(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k9) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k9.class));
        }
        return this.f33430xb98a674b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc
    /* renamed from: isOnPowerSavedMode */
    public boolean mo48898xb1b1d24e() {
        return wh.e1.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        m48890x1bb377a();
        m48888xd00d62e6();
        m48896xb158f775();
    }

    /* renamed from: requireAndWaitForAccountInitialized */
    public void m48899xcf3cda89() {
        m134976x2690a4ac();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc
    /* renamed from: waitFor */
    public void mo48900x42891314() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C();
        }
    }
}
