package bt;

/* loaded from: classes11.dex */
public class b1 implements k35.o {
    public b1(bt.c1 c1Var) {
    }

    public void a(android.content.Context context, boolean z17) {
        java.lang.Boolean bool = gm0.j1.d().f152305o;
        if (bool == null ? true : bool.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAppMgr", "we are in foreground, trigger re-launch now.");
            android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                try {
                    jk.b.d(context.getApplicationContext(), 112, 1, java.lang.System.currentTimeMillis() + 1000, launchIntentForPackage, fp.g0.a(1073741824), false);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAppMgr", th6, "[-] Fail to set alarm.", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAppMgr", "failure to get launcher intent, skip re-launch logic.");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAppMgr", "we are in background, do not re-launch app, just exit app with services remaining");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2) ((ft.h4) i95.n0.c(ft.h4.class))).Ni("Tinker");
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAppMgr", "on kill proc: exitApplicationForTinker, pid=" + android.os.Process.myPid());
        mm.g0.f410016a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
        o4Var.getClass();
        o4Var.putBoolean("is_in_notify_mode", true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("welcome_page_show");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.c(-1, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1();
        c5180xccb1ebb1.f135526g.f88523a = false;
        c5180xccb1ebb1.e();
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).g();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("tinker_reboot").A("last_pid", android.os.Process.myPid());
        com.p314xaae8f345.mm.ui.vb.d(context2, false, z17 ? 1 : 2);
    }
}
