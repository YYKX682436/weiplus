package com.tencent.mm.plugin.account.ui;

/* loaded from: classes12.dex */
public class o7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f74088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f74089e;

    public o7(com.tencent.mm.plugin.account.ui.LoginUI loginUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f74089e = loginUI;
        this.f74088d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String valueOf;
        android.content.Intent intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginUI", "onSceneEnd, in runnable start Launcher");
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f74089e;
        android.content.Intent b17 = y7Var.b(loginUI);
        b17.addFlags(67108864);
        com.tencent.mm.modelsimple.v0 v0Var = (com.tencent.mm.modelsimple.v0) this.f74088d;
        b17.putExtra("kstyle_show_bind_mobile_afterauth", v0Var.O());
        b17.putExtra("kstyle_bind_wording", v0Var.Q());
        b17.putExtra("kstyle_bind_recommend_show", v0Var.P());
        x11.d0 d0Var = x11.f0.f451359m;
        try {
            if (w11.a1.b()) {
                com.tencent.mm.plugin.account.ui.LoginUI loginUI2 = loginUI instanceof android.app.Activity ? loginUI : null;
                android.content.Intent intent2 = loginUI2 != null ? loginUI2.getIntent() : null;
                long longExtra = intent2 != null ? intent2.getLongExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME", 0L) : 0L;
                if (intent2 != null) {
                    intent2.removeExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME");
                }
                if (longExtra != 0) {
                    valueOf = java.lang.String.valueOf(longExtra);
                    d0Var.c(valueOf, longExtra);
                } else {
                    valueOf = java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime());
                }
                b17.putExtra("KEY_NEWINIT_LOGIN_IN_SESSION_ID", valueOf);
                int a17 = d0Var.a();
                long b18 = d0Var.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "recordJumpLauncher() called sessionId:" + valueOf + " cpuCoreNum:" + a17 + " memorySize:" + b18);
                com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct newInitPerformanceStruct = new com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct();
                newInitPerformanceStruct.f59687d = newInitPerformanceStruct.b("reversion", com.tencent.mm.sdk.platformtools.z.f193109e, true);
                newInitPerformanceStruct.f59700q = newInitPerformanceStruct.b("sessionid", valueOf, true);
                newInitPerformanceStruct.f59701r = (long) a17;
                newInitPerformanceStruct.f59702s = b18;
                x11.e0[] e0VarArr = x11.e0.f451357d;
                newInitPerformanceStruct.f59699p = 3;
                x11.b0.f451350a.a(newInitPerformanceStruct, null);
                newInitPerformanceStruct.k();
            } else {
                com.tencent.mm.plugin.account.ui.LoginUI loginUI3 = loginUI instanceof android.app.Activity ? loginUI : null;
                if (loginUI3 != null && (intent = loginUI3.getIntent()) != null) {
                    intent.removeExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "recordJumpLauncher() not need init");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.account.ui.LoginUI loginUI4 = this.f74089e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loginUI4, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI$20", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginUI4.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(loginUI4, "com/tencent/mm/plugin/account/ui/LoginUI$20", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginUI.finish();
    }
}
