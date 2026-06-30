package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes15.dex */
public class a0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z f254089e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar) {
        this.f254089e = zVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.TaskBarAnimController#startMonitorRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        kh4.d dVar = kh4.d.INSTANCE;
        if (dVar.f389588h) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "doStart performanceMonitor");
        if (!dVar.f389588h) {
            dVar.f389588h = true;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Metronome", "[start] stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            dVar.h().postFrameCallback(dVar);
        }
        kh4.f fVar = kh4.f.INSTANCE;
        synchronized (fVar.f389596g) {
            if (fVar.f389594e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PerformanceMonitor", "already running and ignore this requestStartMonitor. If you want run a new one, stop first.");
            } else {
                wu5.c cVar = fVar.f389595f;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                java.lang.System.gc();
                fVar.f389593d.clear();
                fVar.f389593d.put(1, new kh4.a());
                fVar.f389595f = ((ku5.t0) ku5.t0.f394148d).d(new kh4.e(fVar), 0L, 5L);
                fVar.f389594e = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254089e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "delayStopMonitor hasStartMonitor: %b, hasDelayStopMonitor: %b, delay: %d", java.lang.Boolean.valueOf(zVar.D), java.lang.Boolean.valueOf(zVar.E), java.lang.Long.valueOf(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d));
        if (!zVar.D || zVar.E) {
            return;
        }
        wu5.b bVar = zVar.C;
        if (bVar != null) {
            bVar.b();
        }
        zVar.C = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c0(zVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "execute stopMonitorRunnable");
        zVar.E = true;
        ((ku5.t0) ku5.t0.f394148d).l(zVar.C, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "AppBrandDesktopPerformanceMonitor");
    }
}
