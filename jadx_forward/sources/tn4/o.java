package tn4;

@j95.b
/* loaded from: classes11.dex */
public class o extends i95.w implements un4.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f502371d = 16794113;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] f502372e = {null};

    /* renamed from: f, reason: collision with root package name */
    public boolean f502373f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f502374g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f502375h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f502376i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f502377m = null;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f502378n = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571884sj);

    public final boolean Ai(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        boolean z17;
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f502376i;
        if (j0Var == null || !j0Var.isShowing()) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            return false;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            wj(c16114x800e8cdb);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new tn4.g(this, c16114x800e8cdb));
        }
        return false;
    }

    public void Bi() {
        if (this.f502373f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkInitTpcConfig but has init");
        }
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        java.lang.String dir = lp0.b.h0("TPCFileTemp").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        t95.h.f498127b = dir;
        t95.d.f498122a = new tn4.e(this);
        this.f502373f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "initTpcConfig success");
    }

    public boolean Di() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        r45.mm6 m17 = c83.e.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, dialogInfo = %s.", m17);
        if (m17 == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, have tinker update.");
        ((ku5.t0) ku5.t0.f394148d).g(new tn4.m(this, m17, context));
        return false;
    }

    public void Ni(boolean z17, boolean z18, boolean z19) {
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        synchronized (this.f502372e) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f502372e[0];
            if (n3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.PluginUpdater", "[-] Unexpected that mmHandler is null.");
                return;
            }
            if (n3Var.mo50285x8fc9be06(this.f502371d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion hasMessages.");
                this.f502372e[0].mo50303x856b99f0(this.f502371d);
            }
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = this.f502371d;
            obtain.arg1 = z17 ? 1 : 0;
            obtain.arg2 = z18 ? 1 : 0;
            this.f502372e[0].mo50311x7ab51103(obtain, z19 ? 0L : 3000L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion send.");
        }
    }

    public boolean Ri(oq1.n nVar) {
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = (com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) nVar;
            if (c16114x800e8cdb.a() && c16114x800e8cdb.i() && !c16114x800e8cdb.h() && !c16114x800e8cdb.f()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkTinkerSyncResponseVaild, yes, response = %s", nVar);
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkTinkerSyncResponseVaild, no, response = %s", nVar);
        return false;
    }

    public java.lang.String Ui(int i17) {
        java.lang.String str = "";
        if (o45.wf.f424564i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "is GP version: %s", java.lang.Integer.valueOf(o45.wf.f424562g));
            return "";
        }
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_full_pkg_update_default_params, "", true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "tabConfig = null.");
                return "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            int parseInt = java.lang.Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
            int i18 = o45.wf.f424562g;
            java.lang.String string = jSONObject.getString("updateWebviewUrl");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "minBaseApk = %s, updateWebviewUrl = %s.", java.lang.Integer.valueOf(parseInt), string);
                if (parseInt > i18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    if (i17 == 1) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).rj(parseInt);
                    } else if (i17 != 2) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(parseInt);
                    } else {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).sj(parseInt);
                    }
                    return string;
                }
                return "";
            } catch (java.lang.Exception e17) {
                e = e17;
                str = string;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e.getMessage());
                return str;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public java.util.HashMap Vi() {
        java.lang.String Zi;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        if (o45.wf.f424564i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, is GP version: %s", java.lang.Integer.valueOf(o45.wf.f424562g));
            return null;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, isTeenMode()");
            return null;
        }
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_full_pkg_update_default_params, "", true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e17.getMessage());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, tabConfig = null.");
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
        int parseInt = java.lang.Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
        int i18 = o45.wf.f424562g;
        java.lang.String string = jSONObject.getString("updateWebviewUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, minBaseApk = " + parseInt + "updateWebviewUrl = " + string);
        if (parseInt <= i18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return null;
        }
        try {
            str = jSONObject.getString("dialogTipsContent");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "without dialog content, no show dialog.");
            return hashMap;
        }
        try {
            str2 = jSONObject.getString("downloadUrl");
        } catch (java.lang.Exception unused2) {
            str2 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "without downloadUrl, no show dialog.");
            return hashMap;
        }
        hashMap.put("task_url", str2);
        hashMap.put("page_url", string);
        hashMap.put("dialog_tips_content", str);
        android.os.Bundle e18 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.e(string.toLowerCase());
        hashMap.put("version", e18.get("version"));
        try {
            i17 = java.lang.Integer.parseInt("" + e18.get("version"));
        } catch (java.lang.Exception unused3) {
            i17 = 0;
        }
        if (i17 > 0) {
            hashMap.put("task_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bro, com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17)));
        } else {
            hashMap.put("task_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.brn));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "results = %s.", hashMap);
        return hashMap;
    }

    public void Zi() {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("KeyXUpdateVersion", "").apply();
    }

    public void aj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "clickAboutWechatRedDot");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    public void bj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "clickCheckUpdateRedDot");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("RedDotCheckUpdateTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    public void cj(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "clickManualUpdaterTabRedDot");
        if (z17) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
            sharedPreferences.edit().putInt("RedCheckManualUpdaterTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
        } else {
            android.content.SharedPreferences sharedPreferences2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences2, "getSharedPreferences(...)");
            sharedPreferences2.edit().putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fj(oq1.n r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn4.o.fj(oq1.n, int, boolean):boolean");
    }

    public java.lang.String hj() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            java.lang.String k17 = bm5.o1.f104252a.k(bm5.h0.RepairerConfig_Updater_TinkerBaseId_String, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "getBasePatchId, repairerBaseId = %s", k17);
                return k17;
            }
        }
        java.lang.String str = lp0.a.f401789j;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str != null ? str : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "getBasePatchId, baseTinkerId = %s", str2);
        return str2;
    }

    public java.lang.String ij() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            java.lang.String k17 = bm5.o1.f104252a.k(bm5.h0.RepairerConfig_Updater_TinkerPatchId_String, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "getBasePatchId, repairerPatchId = %s", k17);
                return k17;
            }
        }
        java.lang.String a17 = lp0.a.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return a17 == null ? "" : a17;
    }

    public boolean mj() {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences.getInt("RedDotAboutWechatTab", 0) == 1;
    }

    public boolean nj() {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences.getInt("RedCheckManualUpdaterTab", 0) == 1;
    }

    public boolean oj() {
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_full_pkg_update_default_params, "", true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "tabConfig = null.");
                return false;
            }
            int parseInt = java.lang.Integer.parseInt(new org.json.JSONObject(Zi).getString("minBaseApk").substring(2), 16);
            int i17 = o45.wf.f424562g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "hasXUpdateVersion minBaseApk = %s", java.lang.Integer.valueOf(parseInt));
            return parseInt > i17;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        wn4.x.b();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        synchronized (this.f502372e) {
            this.f502372e[0] = new tn4.f(this);
        }
    }

    public boolean pj(r45.mm6 mm6Var) {
        if (mm6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, dialoginfo = null.");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mm6Var.f462205h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, dialoginfo.oldApkMd5 = null.");
            w73.f.h(1001, mm6Var.f462214t);
            return true;
        }
        if (mm6Var.f462214t == 4) {
            java.lang.String g17 = c83.e.g(c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkTinkerBoostInstall, HdiffApk, oldApkMd5 is equal?: %s， dialogInfo.newApkPath = %s, oldApkMd5  = %s, dialogInfo.oldApkMd5 = %s.", java.lang.Boolean.valueOf(mm6Var.f462205h.equalsIgnoreCase(g17)), mm6Var.f462202e, g17, mm6Var.f462205h);
            if (!mm6Var.f462205h.equalsIgnoreCase(g17)) {
                c83.e.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()) {
                    ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).cj(true);
                }
                wn4.x xVar = wn4.x.f529104a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification, hdiff");
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((android.app.NotificationManager) systemService).cancel(9342);
                w73.f.e();
                return true;
            }
        } else {
            java.lang.String g18 = c83.e.g(c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, oldApkMd5 = %s.", g18);
            if (!mm6Var.f462205h.equalsIgnoreCase(g18)) {
                c83.e.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()) {
                    ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).cj(true);
                }
                wn4.x xVar2 = wn4.x.f529104a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification, hdiff");
                java.lang.Object systemService2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                ((android.app.NotificationManager) systemService2).cancel(9342);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qj(int r21, android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn4.o.qj(int, android.content.Context):void");
    }

    public void rj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDot %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 26L, 1L, false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("KeyCurrentUpdateVersion", i17).putInt("RedDotCheckUpdateTab", 1).apply();
    }

    public void sj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "setCheckUpdateWithoutRedDot %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 26L, 1L, false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("KeyCurrentUpdateVersion", i17).apply();
    }

    public void tj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDot %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 26L, 1L, false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("KeyXUpdateVersion", "").putInt("KeyCurrentUpdateVersion", i17).putInt("RedDotCheckUpdateTab", 1).putInt("RedDotAboutWechatTab", 1).putInt("RedDotSettingTab", 1).putInt("RedDotBottomTab", 1).apply();
    }

    public void uj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDotWhenMMDiff %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 26L, 1L, false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("KeyXUpdateVersion", "").putInt("KeyTinkerPatchVersion", i17).putInt("RedCheckManualUpdaterTab", 1).putInt("RedDotAboutWechatTab", 1).putInt("RedDotSettingTab", 1).putInt("RedDotBottomTab", 1).apply();
    }

    public void vj(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDotWhenMMDiff %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 26L, 1L, false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("KeyTinkerPatchVersion", i17).putInt("RedCheckManualUpdaterTab", 1).putInt("RedDotAboutWechatTab", 1).apply();
    }

    public boolean wi(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "HdiffApk checkAndShowInstallPatchDialog, newApkMd5 = " + str);
        java.lang.String l17 = c83.e.l(str);
        if (!com.p314xaae8f345.mm.vfs.w6.j(l17) || !uk.b.a(l17) || !c83.e.n(l17)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkAndShowInstallPatchDialog apk ready %s." + l17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3o));
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3n));
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3m));
        u1Var.l(new tn4.n(this, l17));
        u1Var.q(false);
        return true;
    }

    public final void wj(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f502376i;
        if (j0Var != null && j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            return;
        }
        boolean z17 = c16114x800e8cdb.e() == 4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk show update dialog");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.b()) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574956k43) : c16114x800e8cdb.b());
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.fdx);
        u1Var.a(true);
        u1Var.b(new tn4.h(this, c16114x800e8cdb, z17));
        u1Var.e(new tn4.i(this));
        u1Var.q(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f502377m;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f502377m = null;
        }
        this.f502376i = u1Var.f293531c;
        w73.f.k(z17 ? 108 : com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, z17 ? 108L : 308L, 1L, false);
    }
}
