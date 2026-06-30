package gi;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f353555d;

    public e0(boolean z17) {
        this.f353555d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gi.i0 i0Var = gi.i0.f353587a;
        synchronized (i0Var.a()) {
            if (this.f353555d) {
                if (!gi.i0.f353588b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryLowerEnergyModeManager", "#onAppLowEnergy, AppDoze ON");
                    jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 63L, 1L, false);
                    java.util.Iterator it = i0Var.a().iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.h0) ((ob0.p2) it.next())).g(true);
                    }
                    gi.i0.f353588b = true;
                    final gi.s0 s0Var = new gi.s0("DozeOn");
                    final ph.u e17 = gi.d.e();
                    if (e17 != null) {
                        e17.f435829h.f444870f.post(new java.lang.Runnable() { // from class: gi.s0$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                gi.s0.this.getClass();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DataSamplingMonitor", "start, name = DozeOn");
                                ph.u e18 = gi.d.e();
                                final rh.c1 c1Var = e18 == null ? null : new gi.t0(e18.f435829h, "dataSampling", "DozeOn").f353554a;
                                if (c1Var != null) {
                                    c1Var.I();
                                    e17.f435829h.f444870f.postDelayed(new java.lang.Runnable() { // from class: gi.s0$$b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            rh.c1 c1Var2 = rh.c1.this;
                                            c1Var2.l();
                                            c1Var2.b();
                                        }
                                    }, 12000L);
                                }
                            }
                        });
                    }
                }
            } else if (gi.i0.f353588b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryLowerEnergyModeManager", "#onAppLowEnergy, AppDoze OFF");
                jx3.f.INSTANCE.mo68477x336bdfd8(1540L, 64L, 1L, false);
                java.util.Iterator it6 = i0Var.a().iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.h0) ((ob0.p2) it6.next())).g(false);
                }
                gi.i0.f353588b = false;
            }
        }
    }
}
