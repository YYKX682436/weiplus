package cd1;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.m f122169d;

    public l(cd1.m mVar) {
        this.f122169d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        cd1.m mVar = this.f122169d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "HCEService timer check, timeLimit: %d, hasCommandNotResponded: %b", java.lang.Integer.valueOf(mVar.f122170a.f122177c), java.lang.Boolean.valueOf(mVar.f122170a.f122179e));
        cd1.o oVar = mVar.f122170a;
        oVar.f122181g = true;
        cd1.o.a(oVar, cd1.o.f122172l, true, oVar.f122185k);
    }
}
