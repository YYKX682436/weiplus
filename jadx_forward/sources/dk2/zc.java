package dk2;

/* loaded from: classes3.dex */
public final class zc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f315968d;

    public zc(long j17) {
        this.f315968d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.nw1 nw1Var;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z17 = false;
        long m75942xfb822ef2 = (e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        gk2.e eVar = dk2.ef.I;
        long j17 = this.f315968d;
        if (eVar != null) {
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && c1Var.U7()) {
                z17 = true;
            }
            if (!z17 && m75942xfb822ef2 == j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "keepAlive manual recovery liveId:" + m75942xfb822ef2);
                pm0.z.b(xy2.b.f539688b, "liveKeepAliveBreak_manualRecovery", false, null, null, false, false, new dk2.yc(m75942xfb822ef2), 60, null);
                efVar.B(0L);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keepAlive manual recovery skipped. curLiveRoomData:");
        sb6.append(dk2.ef.I);
        sb6.append(" business(LiveCommonSlice::class.java)?.isLiveFinish():");
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        sb6.append(c1Var2 != null ? java.lang.Boolean.valueOf(c1Var2.U7()) : null);
        sb6.append(" liveId:");
        sb6.append(m75942xfb822ef2);
        sb6.append(" bindLiveId:");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", sb6.toString());
    }
}
