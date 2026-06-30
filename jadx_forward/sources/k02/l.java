package k02;

/* loaded from: classes8.dex */
public abstract class l {
    public static void a(long j17, boolean z17, j35.d dVar) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || c17.f68441x10a0fed7 != 3 || !com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
            if (dVar != null) {
                dVar.a(false);
                return;
            }
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.b(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "install, md5 check fail");
            com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(uc1.y1.f76944x366c91de, 35);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68429xa1e9e82c)) {
            java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.j(c17.f68419xf1e9b966);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
                c17.f68429xa1e9e82c = j18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "get package name from file : %s, %s", c17.f68419xf1e9b966, j18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().canRequestPackageInstalls()) {
            g02.c cVar = new g02.c();
            cVar.a(c17);
            g02.b.c(21, cVar);
        }
        java.lang.String c18 = yb0.a.f542145a.c(c17.f68411x238eb002);
        if (c18 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) {
            yb0.b.a(c17.f68419xf1e9b966, c17.f68411x238eb002);
        }
        k02.a aVar = new k02.a(c17, z17, dVar);
        java.lang.String str = c17.f68419xf1e9b966;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "installApk, path is null");
            g02.c cVar2 = new g02.c();
            cVar2.a(c17);
            cVar2.f348959g = 805;
            g02.b.c(8, cVar2);
            aVar.a(false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "installApk, path = " + str);
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, aVar);
            return;
        }
        g02.c cVar3 = new g02.c();
        cVar3.a(c17);
        cVar3.f348959g = 805;
        g02.b.c(8, cVar3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
        aVar.a(false);
    }

    public static void b(android.content.Context context, java.lang.String str, k02.j jVar) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(context, intent, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), "application/vnd.android.package-archive", false);
        intent.addFlags(268435456);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "installApp");
        if (android.os.Build.BRAND.equals("vivo")) {
            intent.putExtra("installDir", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "is vivo, try to prevent the interception");
        }
        if (i17 >= 26) {
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DownloadAppUtil", e17, "install app failed! %s", intent);
                if (jVar != null) {
                    jVar.a(false);
                }
            }
            if (!context.getPackageManager().canRequestPackageInstalls()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "request install apk permission");
                j35.u.n(new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + context.getPackageName())), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1g), new k02.b(context, intent, jVar));
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "install directly");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader/util/DownloadAppUtil$InstallApkPermissionListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader/util/DownloadAppUtil$InstallApkPermissionListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (jVar != null) {
            jVar.a(true);
        }
        java.lang.String str22 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public static void c(android.content.Context context, int i17, java.lang.String str, java.lang.String str2) {
        if (i17 != 4) {
            d(context, str, null);
            return;
        }
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
        if (launchIntentForPackage != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle, "");
            launchIntentForPackage.putExtras(bundle);
            launchIntentForPackage.addFlags(268435456);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "gamelog.launchGame, launchGameApp, success = " + com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, launchIntentForPackage, null, null, null));
        }
    }

    public static void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        k02.c cVar = new k02.c(a5Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "null or nil appid");
            cVar.a(false, false);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67370x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "appinfo is null or appid is null");
            cVar.a(false, false);
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699());
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33124x838b091d = null;
        c11286x34a5504.f33125x9b39409a = "WX_GameCenter";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67384x996f3ea)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "open id is null or nil, try to get from server:[%s]", h17.f67372x453d1e07);
            zo3.p.Ui().b(h17.f67370x28d45f97);
        }
        p95.a.a(new k02.d(context, h17, c11286x34a5504, cVar));
    }

    public static void e(android.content.Context context, int i17, h02.a aVar) {
        int m40062x608a19a0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
        if (m40062x608a19a0 == 0) {
            m40062x608a19a0 = 1;
        } else if (m40062x608a19a0 == 1) {
            m40062x608a19a0 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16099, java.lang.Integer.valueOf(m40062x608a19a0), 17, 1701, 1, java.lang.Integer.valueOf(i17), aVar.f68404x28d45f97, "", "", java.lang.Long.valueOf(aVar.f68408x32b20428), java.lang.Integer.valueOf(aVar.f68436x2261a7a0));
    }

    public static void f(android.content.Context context, h02.a aVar, k02.k kVar) {
        if (context == null || kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "showPauseDialog error context is null or pauseDialogCallback is null");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DownloadAppUtil", "showPauseDialog error context is not Activity");
            kVar.d();
            return;
        }
        if (((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DownloadAppUtil", "showPauseDialog error curActivity.isFinishing()");
            kVar.d();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.f293405n = new k02.e(context);
        int[] iArr = {0};
        k0Var.f293414s = new k02.f(context, aVar, kVar);
        long j17 = aVar.f68443x78351860;
        int i17 = j17 != 0 ? (int) ((aVar.f68413xf432b5ad * 100) / j17) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lp6));
        sb6.append(i17);
        sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lp7));
        k0Var.q(sb6, 17);
        k0Var.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573738lp4));
        k0Var.C = new k02.g(iArr, context, aVar, kVar);
        k0Var.n(true);
        k0Var.f293387d = new k02.h(iArr, kVar);
        k0Var.v();
        if (!k0Var.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DownloadAppUtil", "showPauseDialog error BottomSheet tryShow failed");
            kVar.d();
        }
        e(context, 1, aVar);
    }
}
