package ly3;

/* loaded from: classes13.dex */
public final class h extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public long f403788d;

    public h() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!event.f135497g.f87945a) {
            if (gm0.j1.a()) {
                if (this.f403788d == 0) {
                    java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINOF_WATCH_SO_RES_CHECK_LAST_TIME_LONG_SYNC, 0L);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
                    this.f403788d = ((java.lang.Long) m17).longValue();
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - this.f403788d >= 86400000) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_rtos_auto_dowanload_so_enable_android, 0) == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckListener", "rtos auto check so resource");
                        this.f403788d = currentTimeMillis;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINOF_WATCH_SO_RES_CHECK_LAST_TIME_LONG_SYNC, java.lang.Long.valueOf(currentTimeMillis));
                        ly3.n nVar = ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).f414362o;
                        nVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResMgr", "autoCheckSoRes");
                        nVar.f403809a.j(null);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckListener", "rtos disable auto check so resource");
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.SoResCheckListener", "acc no ready.");
            }
        }
        return false;
    }
}
