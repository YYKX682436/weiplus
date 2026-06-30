package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74110d;

    public p7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f74110d = loginUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f74110d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = loginUI.f73411o;
        if (w6Var.f74287c.length() <= 2) {
            java.lang.String str = w6Var.f74286b;
            if ((str.startsWith(":") || str.matches("^(：|@|//).*")) && str.replaceAll("^(：|@|//)", ":").equalsIgnoreCase(":airup")) {
                try {
                    android.content.Intent intent = new android.content.Intent(loginUI, java.lang.Class.forName(loginUI.getPackageName() + ".recovery.ui.RecoveryToolsUI"));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(loginUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI", "handleDebugCommand", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    loginUI.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(loginUI, "com/tencent/mm/plugin/account/ui/LoginUI", "handleDebugCommand", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.ClassNotFoundException unused) {
                    dp.a.makeText(loginUI, com.tencent.mm.R.string.o7p, 1).show();
                }
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
        }
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(loginUI).a(com.tencent.mm.plugin.account.ui.k3.class)).U6();
        gm0.j1.d().a(252, loginUI);
        gm0.j1.d().a(701, loginUI);
        gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(w6Var.f74286b, w6Var.f74287c, loginUI.f73407h, 2));
        try {
            android.content.Intent intent2 = loginUI.getIntent();
            if (intent2 != null) {
                intent2.putExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME", android.os.SystemClock.elapsedRealtime());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "recordLoginUIClickAuth called");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
        loginUI.X6(true);
    }
}
