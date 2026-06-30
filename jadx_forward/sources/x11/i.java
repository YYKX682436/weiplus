package x11;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f532908d;

    public i(x11.t tVar) {
        this.f532908d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x11.t tVar = this.f532908d;
        java.lang.Thread thread = tVar.B;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Long l17 = tVar.A;
        boolean z17 = true;
        if (thread == null) {
            tVar.A = null;
        } else if (thread.getState() != java.lang.Thread.State.BLOCKED) {
            tVar.A = null;
        } else if (l17 == null) {
            tVar.A = java.lang.Long.valueOf(currentTimeMillis);
        } else if (java.lang.Math.abs(currentTimeMillis - l17.longValue()) >= 20000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneInit.dkInit", "block detected. do report. do dump");
            jz5.g gVar = p01.b.f431893a;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) p01.b.f431893a).mo141623x754a37bb()).putBoolean("need_revert_v2", true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
            c6423x452b9f7c.f137646e = 2880L;
            c6423x452b9f7c.f137650i = tVar.a().b();
            c6423x452b9f7c.f137651j = 1L;
            c6423x452b9f7c.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            c6423x452b9f7c.k();
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.j();
            z17 = false;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "doBlockDetect firstBlockTime:" + tVar.A + " needDetect:" + z17 + " curTime:" + currentTimeMillis);
        }
        if (!z17 || tVar.f532941y) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).l(new x11.i(tVar), 5000L, "initBlockDetector");
    }
}
