package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class pf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f291038d;

    public pf(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f291038d = c21427xe5bb8a3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f291038d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = c21427xe5bb8a3.f278549c;
        if (c22559x35245a10 == null || c21427xe5bb8a3.f278557k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mDrawedOverTimeTask] skip, mChattingView=%s, mChattingClosed=%s", c22559x35245a10, java.lang.Boolean.valueOf(c21427xe5bb8a3.f278557k));
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = c21427xe5bb8a3.f278560n;
        if (abstractC21611x7536149b == null || !abstractC21611x7536149b.K0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mDrawedOverTimeTask] not ready, leave it to ChattingDataCallback.overTimeTask");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mDrawedOverTimeTask] onDrawed not invoked in %dms, force trigger", 1500L);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a102 = c21427xe5bb8a3.f278549c;
        if (c22559x35245a102.f291795e != null) {
            c22559x35245a102.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.nd(c22559x35245a102));
        }
    }
}
