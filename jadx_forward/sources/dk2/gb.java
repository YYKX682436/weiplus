package dk2;

/* loaded from: classes3.dex */
public final class gb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f315055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f315056e;

    public gb(dk2.tb tbVar, gk2.e eVar) {
        this.f315055d = tbVar;
        this.f315056e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk2.tb tbVar = this.f315055d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "init ".concat(tbVar.c()));
        tbVar.f315659g = this.f315056e;
    }
}
