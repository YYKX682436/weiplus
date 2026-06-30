package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public abstract class n1 {
    public static java.lang.String a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            android.content.pm.PackageInfo packageArchiveInfo = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageArchiveInfo(str, 0);
            if (packageArchiveInfo != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationUtil", "get package name from archive filepath  :%s, package name is : %s", str, packageArchiveInfo.packageName);
                return packageArchiveInfo.packageName;
            }
            throw new java.lang.RuntimeException("info is null; " + str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApplicationUtil", "get package name from archive file path, failed : %s", e17.getMessage());
            return null;
        }
    }

    public static int b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        try {
            android.content.pm.PackageInfo packageArchiveInfo = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageArchiveInfo(str, 0);
            if (packageArchiveInfo != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationUtil", "get package version code from archive filepath  :%s, package version code is : %d", str, java.lang.Integer.valueOf(packageArchiveInfo.versionCode));
                return packageArchiveInfo.versionCode;
            }
            throw new java.lang.RuntimeException("info is null; " + str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApplicationUtil", "get package version code from archive file path, failed : %s", e17.getMessage());
            return 0;
        }
    }

    public static void c(android.content.Context context, android.content.Intent intent, j35.d dVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationUtil", "installApp");
        if (z17 && android.os.Build.BRAND.equals("vivo")) {
            intent.putExtra("installDir", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationUtil", "is vivo, try to prevent the interception");
        }
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApplicationUtil", e17, "install app failed! %s", intent);
            if (dVar != null) {
                dVar.a(false);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && !context.getPackageManager().canRequestPackageInstalls()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationUtil", "request install apk permission");
            j35.u.n(new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + context.getPackageName())), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1g), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k1(context, intent, dVar));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationUtil", "install directly");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/pluginsdk/permission/InstallApkListener;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/pluginsdk/permission/InstallApkListener;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (dVar != null) {
            dVar.a(true);
        }
    }

    public static void d(android.content.Context context, java.lang.String str, j35.d dVar, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            e(context, str, dVar, z17);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10768xcfd1c1ef.f149992e, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19587xf385fa2.IPCInstallAppParam(1, str, null, z17), com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19587xf385fa2.class, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l1(dVar));
        }
    }

    public static void e(android.content.Context context, java.lang.String str, j35.d dVar, boolean z17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(context, intent, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), "application/vnd.android.package-archive", false);
        intent.addFlags(268435456);
        c(context, intent, dVar, z17);
    }
}
