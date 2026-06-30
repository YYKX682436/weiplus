package hh;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hh.f f362967d;

    public e(hh.f fVar) {
        this.f362967d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task run manualFinish = ");
        hh.f fVar = this.f362967d;
        sb6.append(fVar.f362972e);
        ah.i.b("MicroMsg.SDK.SyncTask", sb6.toString(), new java.lang.Object[0]);
        if (fVar.f362972e) {
            fVar.a();
        } else {
            fVar.a();
            fVar.b(null);
        }
        fVar.f362971d = android.os.SystemClock.elapsedRealtime() - fVar.f362970c;
    }
}
