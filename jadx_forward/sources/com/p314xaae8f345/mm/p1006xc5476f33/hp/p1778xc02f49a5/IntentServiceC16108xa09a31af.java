package com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService */
/* loaded from: classes8.dex */
public class IntentServiceC16108xa09a31af extends android.app.IntentService {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f223920q = 0;

    /* renamed from: d, reason: collision with root package name */
    public x73.e f223921d;

    /* renamed from: e, reason: collision with root package name */
    public long f223922e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223923f;

    /* renamed from: g, reason: collision with root package name */
    public int f223924g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f223925h;

    /* renamed from: i, reason: collision with root package name */
    public int f223926i;

    /* renamed from: m, reason: collision with root package name */
    public int f223927m;

    /* renamed from: n, reason: collision with root package name */
    public int f223928n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f223929o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 f223930p;

    public IntentServiceC16108xa09a31af() {
        super("MMDiffInstallApkService");
        this.f223930p = new x73.d(this);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onDestroy hasCallback=%b", java.lang.Boolean.valueOf(this.f223923f));
        if (!this.f223923f) {
            this.f223923f = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this.f223930p);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.Map d17;
        int P;
        int i17;
        long b17;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MMDiffInstallApkService.HdiffApk", "AbstractResultService received a null intent, ignoring.");
            stopSelf();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("notify_type_extra");
        if ("mmdiff_apk_has_ready".equals(stringExtra)) {
            java.util.Map map = c83.e.f121211a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putLong(c83.e.f121213c, java.lang.System.currentTimeMillis()).apply();
            w73.a.e("mmdiff_goto_apk_install", 0, 0);
            stopSelf();
            return;
        }
        if ("mmdiff_apk_has_update_notify".equals(stringExtra)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("mmdiff_udpate_maunal_cgi", true);
            intent2.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI").addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/hp/mmdiff/MMDiffInstallApkService", "onHandleIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/hp/mmdiff/MMDiffInstallApkService", "onHandleIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            w73.f.h(103, 4);
            stopSelf();
            return;
        }
        if ("mmdiff_download_full_apk_notify".equals(stringExtra)) {
            this.f223925h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            x73.e eVar = x73.e.TO_DOWNLOAD;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "setDownloadState old=%s new=%s", this.f223921d, eVar);
            this.f223921d = eVar;
            java.lang.String stringExtra2 = intent.getStringExtra("task_name");
            java.lang.String stringExtra3 = intent.getStringExtra("task_url");
            java.lang.String stringExtra4 = intent.getStringExtra("alternative_url");
            long longExtra = intent.getLongExtra("task_size", 0L);
            java.lang.String stringExtra5 = intent.getStringExtra("file_md5");
            java.lang.String stringExtra6 = intent.getStringExtra("extInfo");
            java.lang.String stringExtra7 = intent.getStringExtra("fileType");
            java.lang.String stringExtra8 = intent.getStringExtra("appid");
            this.f223929o = intent.getStringExtra("package_name");
            java.lang.String stringExtra9 = intent.getStringExtra("thumb_url");
            java.lang.String stringExtra10 = intent.getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            java.lang.String stringExtra11 = intent.getStringExtra("page_url");
            int intExtra = intent.getIntExtra("task_scene", 0);
            this.f223926i = intent.getIntExtra("page_scene", 0);
            this.f223928n = intent.getIntExtra("from_scene", 0);
            this.f223927m = intent.getIntExtra("task_download_type", 0);
            java.lang.String str6 = stringExtra10;
            java.lang.String str7 = stringExtra4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onCreate: md5=%s, url=%s, extInfo=%s, fileType=%s, appId=%s, packageName=%s, taskSize=%d, thumbUrl=%s, pageScene=%s", stringExtra5, stringExtra3, stringExtra6, stringExtra7, stringExtra8, this.f223929o, java.lang.Long.valueOf(longExtra), stringExtra9, java.lang.Integer.valueOf(this.f223926i));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, stringExtra8, 1, stringExtra11, stringExtra3, java.lang.Integer.valueOf(this.f223928n));
            this.f223924g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(stringExtra7, 1);
            java.lang.String stringExtra12 = intent.getStringExtra("app_developer");
            java.lang.String stringExtra13 = intent.getStringExtra("app_version");
            java.lang.String stringExtra14 = intent.getStringExtra("app_privacy_url");
            java.lang.String stringExtra15 = intent.getStringExtra("app_permission_url");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra12) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra13) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223929o)) {
                try {
                    d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(getAssets().open("app_info_arrays.xml")), "apps", null);
                    P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".apps.$count"), 0);
                    i17 = 0;
                } catch (java.io.IOException unused) {
                }
                while (i17 < P) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".apps.app");
                    sb6.append(i17 > 0 ? java.lang.Integer.valueOf(i17) : "");
                    java.lang.String sb7 = sb6.toString();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(sb7);
                    int i18 = P;
                    sb8.append(".$name");
                    java.lang.String str8 = (java.lang.String) d17.get(sb8.toString());
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(sb7);
                    str2 = str7;
                    try {
                        sb9.append(".$package");
                        java.lang.String str9 = (java.lang.String) d17.get(sb9.toString());
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        sb10.append(sb7);
                        str = stringExtra3;
                        try {
                            sb10.append(".$task");
                            java.lang.String str10 = (java.lang.String) d17.get(sb10.toString());
                            str3 = str6;
                            try {
                                if (!str8.equalsIgnoreCase(str3) && !str8.equalsIgnoreCase(stringExtra2) && !str9.equalsIgnoreCase(this.f223929o) && !str10.equalsIgnoreCase(stringExtra2)) {
                                    i17++;
                                    str6 = str3;
                                    P = i18;
                                    str7 = str2;
                                    stringExtra3 = str;
                                }
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra13)) {
                                    stringExtra13 = (java.lang.String) d17.get(sb7 + ".$version");
                                }
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra12)) {
                                    stringExtra12 = (java.lang.String) d17.get(sb7 + ".$developer");
                                }
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f223929o)) {
                                    this.f223929o = str9;
                                }
                            } catch (java.io.IOException unused2) {
                            }
                        } catch (java.io.IOException unused3) {
                        }
                    } catch (java.io.IOException unused4) {
                        str = stringExtra3;
                    }
                    str4 = stringExtra12;
                    str5 = stringExtra13;
                }
                str = stringExtra3;
                str2 = str7;
                str3 = str6;
                str4 = stringExtra12;
                str5 = stringExtra13;
            } else {
                str = stringExtra3;
                str2 = str7;
                str4 = stringExtra12;
                str5 = stringExtra13;
                str3 = str6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "title:%s taskName:%s, package:%s, version:%s, developer:%s, permissionUrl:%s, privacyAgreementUrl:%s", str3, stringExtra2, this.f223929o, str5, str4, stringExtra15, stringExtra14);
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(this.f223925h)) {
                dp.a.m125854x26a183b(this.f223925h, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573741fm1), 0).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "startDownload fail, network not ready");
                return;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(this.f223925h)) {
                java.lang.String str11 = this.f223929o;
                java.lang.String str12 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, stringExtra8, 2, stringExtra11, str12, java.lang.Integer.valueOf(this.f223928n));
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
                t0Var.f178683a = str12;
                t0Var.f178684b = str2;
                t0Var.f178686d = stringExtra2;
                t0Var.f178687e = stringExtra5;
                t0Var.f178689g = stringExtra8;
                t0Var.f178690h = str11;
                t0Var.f178691i = true;
                t0Var.f178688f = this.f223924g;
                t0Var.f178699q = stringExtra6;
                t0Var.f178694l = intExtra;
                boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_download_use_mars, 1) == 1;
                int i19 = this.f223927m;
                if (i19 == 1 && z17) {
                    t0Var.f178704v = i19;
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
                } else {
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "downloadOpBtn.onClick, lastDownloadId = %d, downloadId=%d, useMars=%b, downloadType=%d", java.lang.Long.valueOf(this.f223922e), java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f223927m));
                this.f223922e = b17;
                this.f223923f = true;
                if (b17 <= 0) {
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ceh), 1).show();
                    stopSelf();
                } else {
                    x73.e eVar2 = x73.e.DOWNLOADING;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "setDownloadState old=%s new=%s", this.f223921d, eVar2);
                    this.f223921d = eVar2;
                    ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).wi("WebViewDownloadUI_startDownload");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(this.f223930p);
        }
    }
}
