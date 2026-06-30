package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d f155643d;

    public p7(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d) {
        this.f155643d = activityC11438x77a05b9d;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = this.f155643d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = activityC11438x77a05b9d.f154944o;
        if (w6Var.f155820c.length() <= 2) {
            java.lang.String str = w6Var.f155819b;
            if ((str.startsWith(":") || str.matches("^(：|@|//).*")) && str.replaceAll("^(：|@|//)", ":").equalsIgnoreCase(":airup")) {
                try {
                    android.content.Intent intent = new android.content.Intent(activityC11438x77a05b9d, java.lang.Class.forName(activityC11438x77a05b9d.getPackageName() + ".recovery.ui.RecoveryToolsUI"));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC11438x77a05b9d, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI", "handleDebugCommand", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC11438x77a05b9d.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC11438x77a05b9d, "com/tencent/mm/plugin/account/ui/LoginUI", "handleDebugCommand", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.ClassNotFoundException unused) {
                    dp.a.m125853x26a183b(activityC11438x77a05b9d, com.p314xaae8f345.mm.R.C30867xcad56011.o7p, 1).show();
                }
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(activityC11438x77a05b9d).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).U6();
        gm0.j1.d().a(252, activityC11438x77a05b9d);
        gm0.j1.d().a(701, activityC11438x77a05b9d);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.v0(w6Var.f155819b, w6Var.f155820c, activityC11438x77a05b9d.f154940h, 2));
        try {
            android.content.Intent intent2 = activityC11438x77a05b9d.getIntent();
            if (intent2 != null) {
                intent2.putExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME", android.os.SystemClock.elapsedRealtime());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "recordLoginUIClickAuth called");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
        activityC11438x77a05b9d.X6(true);
    }
}
