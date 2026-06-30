package hp5;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp5.e f364476d;

    public a(hp5.e eVar) {
        this.f364476d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        hp5.e eVar = this.f364476d;
        eVar.f364481b = elapsedRealtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSensorController", "device happened shake in time,%s", java.lang.Long.valueOf(eVar.f364481b));
    }
}
