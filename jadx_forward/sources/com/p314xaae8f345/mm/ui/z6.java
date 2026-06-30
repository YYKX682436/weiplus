package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f294137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.d7 f294138e;

    public z6(com.p314xaae8f345.mm.ui.d7 d7Var, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f294138e = d7Var;
        this.f294137d = r6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "storageDisableAlertExpt on");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f294137d;
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.io.IOException unused) {
            }
        }
        boolean z17 = l75.d1.f398478a;
        boolean z18 = l75.d1.f398480c;
        com.p314xaae8f345.mm.ui.d7 d7Var = this.f294138e;
        if (z18) {
            jx3.f.INSTANCE.d(25984, 400, "", "", "");
            l75.d1.f398481d = true;
            fp.r0.f346765a.f(d7Var.f289863d.f290983a);
            return;
        }
        fp.r0 r0Var = fp.r0.f346765a;
        long a17 = r0Var.a();
        fp.p0 b17 = r0Var.b(a17);
        if (b17 == fp.p0.f346760e) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.ui.o7 o7Var = d7Var.f289863d;
            if (currentTimeMillis - o7Var.f290993k > 10800000) {
                long a18 = com.p314xaae8f345.mm.ui.o7.a(o7Var);
                d7Var.f289863d.f290993k = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "auto clean cache first, sizeCleaned = " + a18);
                jx3.f.INSTANCE.d(25984, 300, "", "", "", java.lang.Long.valueOf(a18));
                return;
            }
            return;
        }
        fp.p0 p0Var = fp.p0.f346761f;
        if (b17 == p0Var || lp.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            long a19 = com.p314xaae8f345.mm.ui.o7.a(d7Var.f289863d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "will show alert, auto clean cache first, sizeCleaned = " + a19);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(25984, 301, "", "", "", java.lang.Long.valueOf(a19));
            if (a19 < 0 || r0Var.b(a17 + a19) == p0Var || lp.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                r0Var.f(d7Var.f289863d.f290983a);
            } else {
                fVar.d(25984, 302, "", "", "", java.lang.Long.valueOf(a19));
            }
        }
    }
}
