package kh4;

/* loaded from: classes15.dex */
public class e extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh4.f f389590d;

    public e(kh4.f fVar) {
        this.f389590d = fVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        synchronized (this.f389590d.f389596g) {
            kh4.f fVar = this.f389590d;
            if (fVar.f389594e) {
                java.util.Iterator it = fVar.f389593d.values().iterator();
                while (it.hasNext()) {
                    kh4.a aVar = (kh4.a) ((kh4.b) it.next());
                    aVar.getClass();
                    double d17 = kh4.d.INSTANCE.f389587g;
                    if (d17 > 60.0d) {
                        d17 = 60.0d;
                    }
                    if (d17 < 0.0d) {
                        d17 = 0.0d;
                    }
                    ((java.util.ArrayList) aVar.f389577a).add(java.lang.Double.valueOf(d17));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PerformanceMonitor", "hy: already stopped");
                cancel();
            }
        }
    }
}
