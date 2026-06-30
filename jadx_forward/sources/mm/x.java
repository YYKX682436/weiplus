package mm;

/* loaded from: classes12.dex */
public class x extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public long f410097b = 0;

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "bg");
        this.f410097b = android.os.SystemClock.uptimeMillis();
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: mm.x$$a
            @Override // java.lang.Runnable
            public final void run() {
                mm.x.this.getClass();
                synchronized ("MicroMsg.NotifyPowerInspector") {
                    ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.NotifyPowerInspector");
                    mm.w.a();
                }
            }
        }, "MicroMsg.NotifyPowerInspector");
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "fg");
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: mm.x$$b
            @Override // java.lang.Runnable
            public final void run() {
                mm.x xVar = mm.x.this;
                xVar.getClass();
                synchronized ("MicroMsg.NotifyPowerInspector") {
                    ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.NotifyPowerInspector");
                }
                final long uptimeMillis = xVar.f410097b > 0 ? android.os.SystemClock.uptimeMillis() - xVar.f410097b : 0L;
                ((ku5.t0) ku5.t0.f394148d).l(new java.lang.Runnable() { // from class: mm.x$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j17 = uptimeMillis;
                        synchronized ("MicroMsg.NotifyPowerInspector") {
                            if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
                                if (j17 > 0) {
                                    long max = java.lang.Math.max(1L, j17 / 60000);
                                    if (z65.c.a() || max > 10) {
                                        mm.w.k(max, false);
                                    }
                                }
                                mm.w.a();
                            }
                        }
                    }
                }, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "MicroMsg.NotifyPowerInspector");
            }
        }, "MicroMsg.NotifyPowerInspector");
    }
}
