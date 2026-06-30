package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes15.dex */
public class c0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z f254111e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar) {
        this.f254111e = zVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.TaskBarAnimController#stopMonitorRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        kh4.a aVar;
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor putInt;
        android.content.SharedPreferences.Editor edit2;
        android.content.SharedPreferences.Editor putInt2;
        kh4.d dVar = kh4.d.INSTANCE;
        if (dVar.f389588h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "doStop performanceMonitor");
            dVar.f389585e = 0L;
            dVar.f389586f = 0;
            dVar.f389588h = false;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Metronome", "[stop] stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            dVar.h().removeFrameCallback(dVar);
            kh4.f fVar = kh4.f.INSTANCE;
            synchronized (fVar.f389596g) {
                if (fVar.f389594e) {
                    wu5.c cVar = fVar.f389595f;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    fVar.f389594e = false;
                }
            }
            kh4.b bVar = (kh4.b) fVar.f389593d.get(1);
            if (bVar instanceof kh4.a) {
                kh4.a aVar2 = (kh4.a) bVar;
                java.util.List list = aVar2.f389577a;
                if (list != null) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    if (arrayList.size() <= 10000 && arrayList.size() != 0) {
                        java.util.Iterator it = arrayList.iterator();
                        double d17 = 0.0d;
                        while (it.hasNext()) {
                            double doubleValue = ((java.lang.Double) it.next()).doubleValue();
                            d17 += doubleValue;
                            aVar2.f389579c = java.lang.Math.min(aVar2.f389579c, doubleValue);
                            aVar2.f389580d = java.lang.Math.max(aVar2.f389580d, doubleValue);
                        }
                        aVar2.f389578b = d17 / arrayList.size();
                    }
                }
                aVar = (kh4.a) bVar;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "doStop performanceMonitor dump fps, max: %f, min: %f, average: %f", java.lang.Double.valueOf(aVar.f389580d), java.lang.Double.valueOf(aVar.f389579c), java.lang.Double.valueOf(aVar.f389578b));
                jh4.c cVar2 = jh4.c.f381379a;
                double d18 = aVar.f389578b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundConfig", "adjustDynamicBackgroundDrawFps currentDrawFps: %d, appFps: %f", java.lang.Integer.valueOf(jh4.c.f381380b), java.lang.Double.valueOf(d18));
                if (d18 >= 45.0d) {
                    gh4.j0.c(true);
                    if (d18 >= 55.0d) {
                        jh4.c.f381380b = 20;
                    } else if (d18 >= 50.0d) {
                        jh4.c.f381380b = 15;
                    } else if (d18 >= 45.0d) {
                        jh4.c.f381380b = 5;
                    }
                } else if (jh4.c.f381380b == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundConfig", "adjustDynamicBackgroundDrawFps disable DynamicBackground");
                    gh4.j0.c(false);
                } else {
                    jh4.c.f381380b = 2;
                    gh4.j0.c(true);
                }
                int i17 = (int) d18;
                jh4.c.f381382d = i17;
                android.content.SharedPreferences d19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
                if (d19 != null && (edit2 = d19.edit()) != null && (putInt2 = edit2.putInt("current_draw_fps", jh4.c.f381380b)) != null) {
                    putInt2.apply();
                }
                if (d19 != null && (edit = d19.edit()) != null && (putInt = edit.putInt("current_app_fps", i17)) != null) {
                    putInt.apply();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundConfig", "adjustDynamicBackgroundDrawFps appFps: %f, FRAME_PER_SECOND: %d", java.lang.Double.valueOf(d18), java.lang.Integer.valueOf(jh4.c.f381380b));
                cVar2.a();
            }
            kh4.f fVar2 = kh4.f.INSTANCE;
            fVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PerformanceMonitor", "PerformanceMonitor release");
            java.util.HashMap hashMap = fVar2.f389593d;
            if (hashMap != null) {
                hashMap.clear();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b0(this));
        }
    }
}
