package lo3;

/* loaded from: classes8.dex */
public class f implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo3.g f401718d;

    public f(lo3.g gVar) {
        this.f401718d = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        nb.f dVar;
        lo3.g gVar = this.f401718d;
        try {
            int i17 = nb.e.f417561d;
            if (iBinder == null) {
                dVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.iqoo.secure.antifraud.thirdpart.IAntiFraudDetectService");
                dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof nb.f)) ? new nb.d(iBinder) : (nb.f) queryLocalInterface;
            }
            gVar.f401722e = dVar;
            int g17 = ((nb.d) gVar.f401722e).g(gVar.f401721d);
            if (g17 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAFM", "register failed: ret=" + g17);
            }
            gVar.f401722e.asBinder().linkToDeath(new lo3.e(this), 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VAFM", "connect error: " + th6);
            gVar.f401722e = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f401718d.f401722e = null;
    }
}
