package q81;

/* loaded from: classes7.dex */
public class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q81.x f442258a;

    public w(q81.x xVar) {
        this.f442258a = xVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry queue drained, interrupt");
        km5.u.b().a(null);
        synchronized (this.f442258a) {
            this.f442258a.f442261d = false;
            ((java.util.concurrent.ConcurrentSkipListSet) this.f442258a.f442263f).clear();
        }
        return null;
    }
}
