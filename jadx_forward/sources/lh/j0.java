package lh;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh.l0 f400138d;

    public j0(lh.l0 l0Var) {
        this.f400138d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh.l0 l0Var = this.f400138d;
        synchronized (l0Var.f400147a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#saving, size=");
            sb6.append(((java.util.HashMap) l0Var.f400147a).size());
            sb6.append(l0Var.f400149c <= 0 ? "" : ", delayActual=" + (java.lang.System.currentTimeMillis() - l0Var.f400149c));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", sb6.toString());
            for (java.util.Map.Entry entry : ((java.util.HashMap) l0Var.f400147a).entrySet()) {
                mh.k.f407804a.b((java.lang.String) entry.getKey(), (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb) entry.getValue(), "acc-power-stats.bin");
            }
        }
        boolean z17 = mm.w.f410075a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "#save");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("notify-inspect.bin");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        mm.y yVar = mm.w.f410078d;
        sb7.append(yVar.f410101a);
        sb7.append("-count");
        M.putLong(sb7.toString(), yVar.f410103c);
        M.putLong(yVar.f410101a + "-during", yVar.f410106f);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        mm.y yVar2 = mm.w.f410080f;
        sb8.append(yVar2.f410101a);
        sb8.append("-count");
        M.putLong(sb8.toString(), yVar2.f410103c);
        M.putLong(yVar2.f410101a + "-during", yVar2.f410106f);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        mm.y yVar3 = mm.w.f410084j;
        sb9.append(yVar3.f410101a);
        sb9.append("-count");
        M.putLong(sb9.toString(), yVar3.f410103c);
        M.putLong(yVar3.f410101a + "-during", yVar3.f410106f);
        M.putLong("light-push-during", mm.w.f410077c);
    }
}
