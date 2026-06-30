package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes11.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f254141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f254142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z f254143f;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar, boolean z17, int i17) {
        this.f254143f = zVar;
        this.f254141d = z17;
        this.f254142e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "openHeader isVisibleHeader: %b, headerOpen: %b", java.lang.Boolean.valueOf(this.f254143f.h()), java.lang.Boolean.valueOf(this.f254143f.N));
        if (this.f254141d || this.f254143f.h()) {
            boolean z17 = false;
            if (this.f254141d) {
                this.f254143f.Z = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "openHeader checkCloseHeaderWhenScrollingByAnim set false");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254143f;
            if (zVar.G1) {
                zVar.getClass();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar2 = this.f254143f;
            zVar2.f254306p0 = true;
            zVar2.H = false;
            zVar2.f254296e.removeCallbacks(zVar2.f254319y0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar3 = this.f254143f;
            android.widget.ListView listView = zVar3.f254296e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.e0(this);
            zVar3.f254319y0 = e0Var;
            listView.post(e0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar4 = this.f254143f;
            if (!zVar4.M) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "checkAndStartPerformanceMonitor not enableNativeBackground not need to monitor");
                return;
            }
            android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
            if (d17 != null) {
                long j17 = d17.getLong("monitory_last_check_time", -1L);
                if (jh4.c.f381382d == 0) {
                    jh4.c.f381382d = d17.getInt("current_app_fps", 0);
                }
                if (j17 == -1 || jh4.c.f381382d <= 45 || java.lang.System.currentTimeMillis() - j17 > 3600000) {
                    d17.edit().putLong("monitory_last_check_time", java.lang.System.currentTimeMillis()).apply();
                    z17 = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundConfig", "needMonitorFps needCheck: %b", java.lang.Boolean.valueOf(z17));
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "checkAndStartPerformanceMonitor no need to check");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "checkAndStartPerformanceMonitor hasStartMonitor: %b, hasDelayStopMonitor: %b", java.lang.Boolean.valueOf(zVar4.D), java.lang.Boolean.valueOf(zVar4.E));
            if (zVar4.D || zVar4.E) {
                return;
            }
            zVar4.D = true;
            wu5.b bVar = zVar4.B;
            if (bVar != null) {
                bVar.b();
            }
            zVar4.B = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a0(zVar4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "execute startMonitorRunnable");
            ((ku5.t0) ku5.t0.f394148d).h(zVar4.B, "AppBrandDesktopPerformanceMonitor");
        }
    }
}
