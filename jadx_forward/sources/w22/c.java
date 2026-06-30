package w22;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.g f524059d;

    public c(w22.g gVar) {
        this.f524059d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CapturePresenter", "voice finish called force");
        w22.g gVar = this.f524059d;
        if (!gVar.f524070h) {
            ((y22.m) gVar.f524065c).e(gVar.f524071i);
        }
        gVar.f524070h = true;
    }
}
