package fe;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe.g f342879d;

    public a(fe.g gVar) {
        this.f342879d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fe.g gVar = this.f342879d;
        gVar.f342886a = gVar.f342894i.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: onFirstFrameRendered picnum:%d", java.lang.Integer.valueOf(gVar.f342886a));
    }
}
