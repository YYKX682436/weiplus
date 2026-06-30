package dr0;

/* loaded from: classes12.dex */
public final class b0 implements dr0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public long f323944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f323945b;

    public b0(dr0.t0 t0Var) {
        this.f323945b = t0Var;
    }

    @Override // dr0.i1
    public void a(boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "onMainProcStandByChanged: " + z17);
        dr0.t0 t0Var = this.f323945b;
        if (z17) {
            this.f323944a = currentTimeMillis;
        } else {
            long j17 = this.f323944a;
            if (1 <= j17 && j17 < currentTimeMillis) {
                long j18 = currentTimeMillis - j17;
                t0Var.i().m46673xa369574a(j18);
                t0Var.f324079f.m46673xa369574a(j18);
                if (mm.o.h(false, 1, null) && j18 >= 600000) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    long accMainProcStandbyMs = t0Var.f324079f.getAccMainProcStandbyMs();
                    long j19 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
                    linkedHashMap.put("standby-minute", java.lang.Long.valueOf(accMainProcStandbyMs / j19));
                    linkedHashMap.put("standby-dataPushCount", java.lang.Long.valueOf(t0Var.f324079f.getAccMainProcStandByMsgCount()));
                    linkedHashMap.put("all-voipCount", java.lang.Long.valueOf(t0Var.f324079f.getAccAllVoipCount()));
                    linkedHashMap.put("standby-voipCount", java.lang.Long.valueOf(t0Var.f324079f.getAccMainProcStandByVoipCount()));
                    long j27 = 0;
                    while (t0Var.f324079f.m46707x9e267bcb().values().iterator().hasNext()) {
                        j27 += r6.next().size();
                    }
                    linkedHashMap.put("standby-addMsgGroupCount", java.lang.Integer.valueOf(t0Var.f324079f.m46707x9e267bcb().keySet().size()));
                    linkedHashMap.put("standby-addMsgCount", java.lang.Long.valueOf(j27));
                    ap.a.a(1, "accProcStandBy", null, linkedHashMap, java.lang.String.valueOf(t0Var.f324079f.getAccMainProcStandByMsgCount()), java.lang.String.valueOf(j18 / j19));
                }
            }
            this.f323944a = 0L;
        }
        t0Var.f324079f.m40828x5a5b64d();
    }
}
