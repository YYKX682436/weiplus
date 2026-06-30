package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class k implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        java.lang.String str2;
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (z65.c.a()) {
            ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            com.tencent.mm.plugin.performance.watchdogs.b0.B.d(true);
        }
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        if (context != null && (activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            int myPid = android.os.Process.myPid();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    str2 = runningAppProcessInfo.processName;
                    break;
                }
            }
        }
        str2 = null;
        com.tencent.mm.plugin.appbrand.menu.devtools.h hVar = new com.tencent.mm.plugin.appbrand.menu.devtools.h(this, n7Var, str2, context);
        com.tencent.mm.plugin.appbrand.menu.devtools.j jVar = new com.tencent.mm.plugin.appbrand.menu.devtools.j(this, n7Var, context);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f228381y = null;
            h4Var.f228382z = null;
        }
        arrayList.clear();
        db5.g4 g4Var = new db5.g4(context);
        hVar.onCreateMMMenu(g4Var);
        if (g4Var.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        k0Var.f211872n = hVar;
        k0Var.f211881s = jVar;
        k0Var.f211854d = null;
        k0Var.G = null;
        k0Var.v();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return context.getString(com.tencent.mm.R.string.f490027iw);
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return z65.c.a() || com.tencent.mm.plugin.appbrand.m6.a(str).f85722o;
    }
}
