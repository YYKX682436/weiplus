package tl;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.t f501587d;

    public j(tl.t tVar) {
        this.f501587d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "stop try stopRecorder, pcmRecorder:%s", this.f501587d.f501669p);
        synchronized (tl.t.f501652x) {
            tl.w wVar = this.f501587d.f501669p;
            if (wVar != null) {
                wVar.l();
                tl.t tVar = this.f501587d;
                tVar.f501669p.f501705y = null;
                tVar.f501669p = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "stop finish stopRecorder, cost:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
