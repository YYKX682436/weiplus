package bt;

/* loaded from: classes11.dex */
public class b1 implements k35.o {
    public b1(bt.c1 c1Var) {
    }

    public void a(android.content.Context context, boolean z17) {
        java.lang.Boolean bool = gm0.j1.d().f70772o;
        if (bool == null ? true : bool.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAppMgr", "we are in foreground, trigger re-launch now.");
            android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                try {
                    jk.b.d(context.getApplicationContext(), 112, 1, java.lang.System.currentTimeMillis() + 1000, launchIntentForPackage, fp.g0.a(1073741824), false);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAppMgr", th6, "[-] Fail to set alarm.", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.appenderFlushSync();
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAppMgr", "failure to get launcher intent, skip re-launch logic.");
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAppMgr", "we are in background, do not re-launch app, just exit app with services remaining");
        }
        ((com.tencent.mm.plugin.appbrand.app.g2) ((ft.h4) i95.n0.c(ft.h4.class))).Ni("Tinker");
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mars.xlog.Log.w("MicroMsg.MMAppMgr", "on kill proc: exitApplicationForTinker, pid=" + android.os.Process.myPid());
        mm.g0.f328483a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
        o4Var.getClass();
        o4Var.putBoolean("is_in_notify_mode", true);
        com.tencent.mm.sdk.platformtools.c3.b("welcome_page_show");
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).getClass();
        com.tencent.mm.booter.notification.l0.f63501a.c(-1, null);
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = false;
        backupProcessMgrExitEvent.e();
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.ui.vb.e();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).g();
        com.tencent.mm.sdk.platformtools.o4.M("tinker_reboot").A("last_pid", android.os.Process.myPid());
        com.tencent.mm.ui.vb.d(context2, false, z17 ? 1 : 2);
    }
}
